
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args){
        int rows = 4;
        int columns = 4;
        // Plug in the numbers given to you
        int[][] a = new int[][]{
                {1, 4, 2, 8},
                {2, 7, 8, 8},
                {1, 2, 2, 2},
                {8, 2, 3, 1}
            };

        //Change these accordingly 
        int r = 3; // some row index                                       
        int c = 2; // some column index
        int sum = 0;

        System.out.println("i=r-1");
        for (int i = r - 1; i <= r + 1; i++)
        {    
            System.out.println("j=c-1");
            for (int j = c - 1; j <= c + 1; j++)
            {                         
                if (0 <= i && i < rows
                && 0 <= j && j < columns
                && !(i == r && j == c))
                {                                                
                    sum = sum + a[i][j];
                    System.out.println("update sum");
                }         
                System.out.println("j++");

            }
            if(i <= r +1){
                System.out.println("i++");
            }
        }

        System.out.println("done");
    }
}
