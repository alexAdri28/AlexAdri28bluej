
import java.util.HashMap;
import java.util.Iterator;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  For each existing exit, the room 
 * stores a reference to the neighboring room.
 * 
 * @author Alex Gordillo Adriano
 * @version 2021.01.19
 */

public class Room 
{
    private String description;
    
    public Room northExit;
    public Room southExit;
    public Room eastExit;
    public Room westExit;
    
    

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        
    }

    /**
     * Define an exit from this room.
     * @param direction The direction of the exit.
     * @param neighbor  The room to which the exit leads.
     */
    public void setExit(Room north,Room east,Room south,Room west) 
    { 
        if(north != null)
           northExit = north;
        if(east != null)
           eastExit = east;
        if(south != null)
           southExit = south;
        if(north != null)
           westExit = west;
           
           
        
        
    }

    /**
     * @return The short description of the room
     * (the one that was defined in the constructor).
     */
    public String getShortDescription()
    {
        return description;
    }
}


    
    

