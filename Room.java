import java.util.HashMap;
/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */
public class Room 
{
    private String description;
    HashMap <String, Room> direcion;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        direcion = new HashMap <>();
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExits(Room north, Room east, Room south, Room west, Room southEast, Room northWest) 
    {
        if(north != null)
            direcion.put("north", north);
        if(east != null)
            direcion.put("east", east);
        if(south != null)
            direcion.put("south", south);
        if(west != null)
            direcion.put("west", west);
        if(southEast != null)
            direcion.put("southEast", southEast);
        if(northWest != null){
            direcion.put("northWest", northWest);
        }    
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

    public Room getExit(String direction)
    {
        Room room = null;
        if(direction.equals( "north")){
            room = direcion.get("north");
        }
        if(direction.equals( "south")){
            room = direcion.get("south");
        }
        if(direction.equals( "east")){
            room = direcion.get("east");
        }
        if(direction.equals( "west")){
            room = direcion.get("west");
        } 
        if(direction.equals( "southEast")){
            room = direcion.get("southEast");
        } 
        if(direction.equals("northWest")){
            room = direcion.get("northWest");
        }
        return room;
    }

    /**
     * Return a description of the room's exits.
     * For example: "Exits: north east west"
     *
     * @ return A description of the available exits.
     */
    public String getExitString()
    {   String exitsDescription = "Exits: ";
        if(direcion.get("north") !=null){
            exitsDescription += "north ";
        }
        if(direcion.get("south") !=null){
            exitsDescription += "south ";
        }
        if(direcion.get("east") !=null){
            exitsDescription += "east ";
        }
        if(direcion.get("west") !=null){
            exitsDescription += "west ";
        }    
        if(direcion.get("southEast") !=null){
            exitsDescription += "southEast ";

        }
        if(direcion.get("northWest") != null){
            exitsDescription += "northWest ";
        }    
        return exitsDescription;

    }
}
