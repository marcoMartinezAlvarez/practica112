import java.util.HashMap;
import java.util.Set;
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
     * Define an exit from this room.
     * @param direction The direction of the exit.
     * @param neighbor The room in the given direction.
     */
    public void setExit(String direction, Room nextRoom){

        direcion.put(direction, nextRoom);

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
    {   Set <String> nombresDirecion = direcion.keySet();
        String exitsDescription = "Exits :";
        for(String direction : nombresDirecion){
            exitsDescription += direction + " ";

        }
        return exitsDescription;

    }
}
