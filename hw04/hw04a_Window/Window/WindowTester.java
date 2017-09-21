public class WindowTester
{
   public static void main(String[] args)
   {
       double width = 1.4; 
       double height = 4.2; 
       Window window1 = new Window(width, height);
       
       width = 3;
       height = 10;
       Window window2 = new Window(width, height);
       
       System.out.printf("%.2f\n",window1.getArea());
       System.out.println("Expected: 957.56");
       System.out.printf("%.2f\n",window1.getCostOfGlaze());
       System.out.println("Expected: 243.22");
       
       System.out.printf("%.2f\n",window2.getArea());
       System.out.println("Expected: 4828.94");
       System.out.printf("%.2f\n",window2.getCostOfGlaze());
       System.out.println("Expected: 1226.55");
       
       window1.setDimensions(3, 10);
       System.out.printf("%.2f\n",window1.getCostOfGlaze());
       System.out.println("Expected: 1226.55");
   }
}