import java.util.ArrayList;

public class CircleManager
{
    private ArrayList<Circle> circles;
    
    public CircleManager(ArrayList<Circle> circles){
        this.circles = circles;
    }
    
    public double averageRadius(){
        if(circles.isEmpty()){
            return 0;
        }

        double radiusSum = 0;
        for(Circle circ: circles){
            radiusSum += circ.getRadius();
        }
        return radiusSum/circles.size();
    }
}
