
/**
 * Write a description of class Framer here.
 *
 * @author Akshat Giri
 */
public class Framer
{
    public static void main(String[] args){
        Picture pic = new Picture();
        pic.load("oliver_bed.jpg");
        int radius;
        
        if(pic.getWidth() < pic.getHeight())
            radius = pic.getWidth() * 40/100;
        else
            radius = pic.getHeight() * 40/100;
            
            
        int centerX = pic.getWidth()/2;
        int centerY = pic.getHeight()/2;
        
        for(int x = 0; x < pic.getWidth(); x++){
            for(int y = 0; y < pic.getHeight(); y++){
                if(Math.pow((x - centerX), 2) + Math.pow((y - centerY), 2) > radius*radius)
                    pic.setColorAt(x, y, Color.BLACK);
            }
        }
        pic.draw();
    }
}
