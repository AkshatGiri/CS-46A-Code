/**
 * Draw a face
 */
public class FaceViewer
{
    public static void main(String[] args)
    {
        Ellipse circ1 = new Ellipse(60, 10, 80, 80);
        
        Rectangle leftEye = new Rectangle(80, 30, 10, 10);
        Rectangle rightEye = new Rectangle(110, 30, 10, 10);  
        
        Line mouth = new Line(80, 70, 120, 70);
        
        //Coloring stuff
        leftEye.setColor(Color.BLUE);
        rightEye.setColor(Color.BLUE);
        mouth.setColor(Color.RED);
        
        //Drawing stuff
        circ1.draw();
        leftEye.fill();
        rightEye.fill();
        mouth.draw();
    }
}
