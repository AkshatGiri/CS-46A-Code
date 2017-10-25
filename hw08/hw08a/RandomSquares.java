import java.util.Random;
/**
 * Draws random squares
 */
public class RandomSquares
{
    public static void main(String[] args)
    {
        final int MAX_X = 200;
        final int MAX_Y = 300;
        int x;
        int y;
        int side;
        Rectangle biggestRect = new Rectangle(0, 0, 0, 0);
        
        Random gen = new Random(987456789);
        for(int i = 0;i < 25; i++){
            x = gen.nextInt(MAX_X);
            y = gen.nextInt(MAX_Y);
            side = gen.nextInt(80) + 20;
            Rectangle rect = new Rectangle(x, y, side, side);
            rect.setColor(Color.GREEN);
            rect.draw();
            
            if(biggestRect.getWidth() < rect.getWidth()){
                biggestRect = rect;
            }
        }
        
        biggestRect.setColor(Color.BLUE);
        biggestRect.fill();

    }
}
