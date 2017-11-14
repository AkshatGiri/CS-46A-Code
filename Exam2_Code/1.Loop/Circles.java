/**
 * Draws 5 tagent Circles 
 */
public class Circles
{
    public static void main(String[] args)
    {
        int x = 0;
        int y = 0;
        for(int i = 0; i < 5; i++){
            Ellipse circle = new Ellipse(x, y, 100, 100);
            x+= 100;
            circle.draw();
        }
       
    }
}
