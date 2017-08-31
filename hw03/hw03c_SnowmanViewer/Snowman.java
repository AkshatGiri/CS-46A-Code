/**
 * Draws a snowman
 */
public class Snowman
{
    private int x;
    private int y;
    
    Snowman(int x1, int y1){
        x = x1;
        y = y1;
    }
    
    void draw(){
       //Hat
       Rectangle hatBox = new Rectangle(x, y, 20, 20);
       Color black = new Color(0, 0, 0);
       hatBox.setColor(black);
       
       Line hatLine = new Line(x - 10, y+20, x + 30,  y + 20);
       
       //Body
       Ellipse topCircle = new Ellipse(x, y + 20, 20 , 20 );
       Ellipse middleCircle = new Ellipse(x-10, y+40, 40, 40);
       Ellipse bottomCircle = new Ellipse(x-20, y+80, 60, 60);
       
       //Drawing
       hatBox.draw();
       hatLine.draw();
       topCircle.draw();
       middleCircle.draw();
       bottomCircle.draw();
       hatBox.fill();
       
    }
    
}
