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
    private String itemDescripcion;
    private float itemPeso;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description, String itemDescripcion,float itemPeso) 
    {
        this.description = description;
        direcion = new HashMap <>();
        this.itemDescripcion = itemDescripcion;
        this.itemPeso = itemPeso;
    }

    /**
     * Define an exit from this room.
     * @param direction The direction of the exit.
     * @param neighbor The room in the given direction.
     */
    public void setExit(String direction, Room nextRoom)
    {
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
        
      return direcion.get(direction);
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

    /**
     * Return a long description of this room, of the form:
     *     You are in the 'name of room'
     *     Exits: north west southwest
     * @return A description of the room, including exits.
     */
    public String getLongDescription()
    {
    
        String longDescription = "Tu est�s en :" + getDescription() + "\n" + getExitString() + "\n"+"Este es le item" + "\n"+" " + itemDescripcion + " :" + itemPeso + "kg .";;
        
        return longDescription;
    }
}
