/**
 * Draws a snowman
 */
public class SnowmanDrawing
{
    public static void main(String[] args)
    {
        //HAT
        Rectangle hatBox = new Rectangle(50, 10, 20, 20);
        Color black = new Color(0, 0, 0);
        hatBox.setColor(black);
        
        Line hatLine = new Line(40, 30, 80, 30);
        //HAT endts here
        
        //Body
        Ellipse topCircle = new Ellipse(50, 30, 20, 20);
        Ellipse middleCircle = new Ellipse(40, 50, 40, 40);       
        Ellipse bottomCircle = new Ellipse(30, 90, 60, 60);
        
        //Drawing 
        hatBox.draw();
        hatLine.draw();
        topCircle.draw();
        middleCircle.draw();
        bottomCircle.draw();
        hatBox.fill();
    }
}
