/**
 * A class to view snowmen from the Snowman class.
 * 
 * @author Kathleen O'Brien
 */
public class SnowmanViewer
{
    public static void main(String[] args)
    {
        Snowman snowman = new Snowman(50, 10);
        snowman.draw();
        
        Snowman snowman1 = new Snowman(110, 50);
        snowman1.draw();
        
        Snowman snowman2 = new Snowman(170, 100);
        snowman2.draw();
        
    }
}