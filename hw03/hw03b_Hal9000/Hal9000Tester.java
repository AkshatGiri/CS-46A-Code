public class Hal9000Tester
{
    public static void main(String[] args)
    {
        Hal9000 hal = new Hal9000("Dave");
        System.out.println(hal.greetCrewMember());
        System.out.println("Expected: Welcome, Dave");
        System.out.println(hal.doCommand("engage drive"));
        System.out.println("Expected: I am sorry, Dave. I can't engage drive");
        hal.setName("Aruna");
        System.out.println(hal.doCommand("power down"));
        System.out.println("Expected: I am sorry, Aruna. I can't power down");
    }
}