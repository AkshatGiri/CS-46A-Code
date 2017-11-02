import java.util.ArrayList;
import java.awt.Point;

public class PointsGalore
{
    // instance variables - replace the example below with your own
    private ArrayList<Point> points;
    private static final int DIAMETER = 3;

    public PointsGalore(ArrayList<Point> list)
    {
        // initialise instance variables
        points = list;
    }

    public void drawRectangle()
    {
        final int WIDTH = 50;
        final int HEIGHT = 30;
        drawPoints();
        
        drawRect();
      
    }
    
    public void drawRect(){
        double x = points.get(0).getX();
        double y = points.get(0).getY();
        Rectangle rect = new Rectangle(x, y, 50, 30);
        rect.draw();
    }

    public void drawPoints()
    {
        for (Point p : points)
        {
            double x = p.getX();
            double y = p.getY();
            Ellipse circle = new Ellipse (x, y, DIAMETER, DIAMETER);
            circle.fill();
        }
    }
}
