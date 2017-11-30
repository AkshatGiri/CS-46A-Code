public class Computer implements Comparable
{
    private String brand;
    private double ghz;

    public Computer(String brand, double ghz){
        this.brand = brand;
        this.ghz = ghz;
    }

    public double getGhz(){
        return this.ghz;
    }

    public String getBrand(){
        return this.brand;
    }

    public int compareTo(Object obj){
        Computer otherComp = (Computer) obj;
        if(ghz == otherComp.getGhz()){
            return brand.compareTo(otherComp.getBrand());
        } else {
            return Double.compare(ghz, otherComp.getGhz());
        }
    }

    /**
     * Gets a string representation of the object
     * @return a string representation of the object
     */
    public String toString()
    {
        String s = getClass().getName()
            + "[brand=" + brand
            + ",gigahertz=" + ghz 
            + "]";
        return s;
    }
}
