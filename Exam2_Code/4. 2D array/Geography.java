public class Geography
{
    private int[][] mountains;
    
    public Geography(int[][] array){
        mountains = array;
    }
    
    public int lowest(){
        int lowest = mountains[0][0];
        for(int i = 0; i < mountains.length; i++){
            for(int j = 0; j < mountains[i].length; j++){
                if(lowest > mountains[i][j])
                    lowest = mountains[i][j];
            }
        }
        
        
        return lowest;
    }
    
    public int lastEntry(){
        return mountains[mountains.length-1][mountains[mountains.length-1].length-1];
    }
}
