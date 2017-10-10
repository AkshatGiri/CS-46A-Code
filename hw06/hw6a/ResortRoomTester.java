/**
 * Tester for ResortRoom
 * @author Kathleen O'Brien
 */
public class ResortRoomTester
{
   public static void main(String[]args)
   {    
       ResortRoom room = new ResortRoom(ResortRoom.OCEAN_SIDE, 2);
       System.out.println(room.getType() + " " + room.getOccupants()
        + " " + room.getCost());
       System.out.println("Expected: ocean 2 250.0");
       
       room.setOccupants(1); 
       System.out.println(room.getType() + " " + room.getOccupants()
        + " " + room.getCost());
       System.out.println("Expected: ocean 1 250.0");
       
       room.setOccupants(0); 
       System.out.println(room.getType() + " " + room.getOccupants()
        + " " + room.getCost());
       System.out.println("Expected: ocean 2 250.0");
       
       room = new ResortRoom(ResortRoom.OCEAN_SIDE, 4);
       System.out.println(room.getType() + " " + room.getOccupants()
        + " " + room.getCost());
       System.out.println("Expected: ocean 4 370.0");
       
       room.setOccupants(6);
       System.out.println(room.getType() + " " + room.getOccupants()
        + " " + room.getCost());
       System.out.println("Expected: ocean 6 570.0");
       
       //test bad type
       room = new ResortRoom(3, 3);
       System.out.println(room.getType() + " " + room.getOccupants()
        + " " + room.getCost());
       System.out.println("Expected: ocean 3 370.0");
       
       room = new ResortRoom(ResortRoom.STREET_SIDE, 2);
       System.out.println(room.getType() + " " + room.getOccupants()
        + " " + room.getCost());
       System.out.println("Expected: street 2 175.0");
       
       room.setOccupants(1); 
       System.out.println(room.getType() + " " + room.getOccupants()
        + " " + room.getCost());
       System.out.println("Expected: street 1 175.0");
       
       room = new ResortRoom(ResortRoom.STREET_SIDE, 3);
       System.out.println(room.getType() + " " + room.getOccupants()
        + " " + room.getCost());
       System.out.println("Expected: street 3 260.0");
       
       room = new ResortRoom(ResortRoom.STREET_SIDE, 5);
       System.out.println(room.getType() + " " + room.getOccupants()
         + " " + room.getCost());
       System.out.println("Expected: street 5 360.0");
    }
}