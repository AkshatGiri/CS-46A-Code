public class SpecialRectangle extends Rectangle
{
    private String paintColor;

    public SpecialRectangle(int x, int y, int width, int height){
        super(x, y, width, height);
        paintColor = "silver";
        setColor(new Color(204, 204, 204));

    }

    public SpecialRectangle(int x, int y, int width, int height, String paintColor){
        super(x, y, width, height);
        setPaintColor(paintColor);
    }

    public String getPaintColor(){
        return paintColor;
    }

    public void setPaintColor(String col){
        if(col.equals("vanilla")){
            paintColor = col;
            setColor(new Color(255, 255, 248));
        }
        else if(col.equals("blue_green")){
            paintColor = col;
            setColor(new Color(204, 255, 255));
        }
        else if(col.equals("purple")){
            paintColor = col;
            setColor(new Color(159, 0, 197));
        }
        else if(col.equals("burnt_orange")){
            paintColor = col;
            setColor(new Color(227, 117, 00));
        }
        else {
            paintColor = "silver";
            setColor(new Color(204, 204, 204));
        }
    }
}
