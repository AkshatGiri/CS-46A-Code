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

    private void drawRect(){
        double x = getMinimumX();
        double y = getMinimumY();
        double width = getMaximumX() - x;
        double height = getMaximumY() - y;
        Rectangle rect = new Rectangle(x, y, width, height);
        rect.draw();
    }

    private double getMinimumX(){
        double min = points.get(0).getX();
        for(Point point: points){
            if(min > point.getX()){
                min = point.getX();
            }
        }
        return min;
    }

    private double getMaximumX(){
        double max = points.get(0).getX();
        for(Point point: points){
            if(max < point.getX()){
                max = point.getX();
            }
        }
        return max;
    }

    private double getMinimumY(){
        double min = points.get(0).getY();
        for(Point point: points){
            if(min > point.getY()){
                min = point.getY();
            }
        }
        return min;
    }

    public double getMaximumY(){
        double max = points.get(0).getY();
        for(Point point: points){
            if(max < point.getY()){
                max = point.getY();
            }
        }
        return max;
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
