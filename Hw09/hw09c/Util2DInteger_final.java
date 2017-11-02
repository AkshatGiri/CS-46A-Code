
/**
 * @author Akshat Giri
 */
public class Util2DInteger
{

    private int[][] nums;

    /**
     * Constructor for objects of class Util2DInteger
     * @param nums 2d array of ints
     */
    public Util2DInteger(int[][] nums)
    {
        this.nums = nums;
    }
    
    /**
     * @return smallest int in the 2D array. 
     */
    public int getSmallest(){
        int smallest = nums[0][0];
        for(int i =0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                if(smallest > nums[i][j]){
                    smallest = nums[i][j];
                }
            }
        }
        
        return smallest;
    }
    
    /**
     * @return produc tthe product of the ints in the array
     */
    public int product(){
        int product = 1;
        for(int i =0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                product = product * nums[i][j];
            }
        }
        return product;
    }
    
    /**
     * @return last element of the last column of the last row. 
     */
    public int last(){
        return nums[nums.length-1][nums[nums.length-1].length - 1];
    }
    
    /**
     * @param target the int that needs to be checked in the array. 
     * @return true or false depending on if the the target exists. 
     */
    public boolean contains(int target){
        for(int i =0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                if(target == nums[i][j])
                    return true;
            }
        }
        return false;
    }
}
