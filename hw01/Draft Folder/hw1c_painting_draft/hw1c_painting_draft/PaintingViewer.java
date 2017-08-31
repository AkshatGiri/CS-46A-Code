//SOLUTION
/**
 * Enlarges an image of a painting
 * 
 * @author Kathleen O'Brien
 */
public class PaintingViewer
{
    public static void main(String[] args)
    {
//HIDE
        Picture painting = new Picture("starry_night.png");
        //moving the picture
        painting.translate(100, 50);
        //growing the picture
        painting.grow(painting.getWidth()/2, painting.getHeight()/2);
        
        painting.draw();
//SHOW
    }
}