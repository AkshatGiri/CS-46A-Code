public class Reflector
{
    public static void main(String[] args){
        Picture pic = new Picture("reflect.png");
        for(int i = 0; i < pic.getHeight(); i++){
            for(int j = 0; j < pic.getWidth(); j++){
                if(j > pic.getWidth() / 2){
                    Color mirror = pic.getColorAt(pic.getWidth() - j, i);
                    pic.setColorAt(j, i, mirror);
                }
            }
        }
        pic.draw();
    }
}
