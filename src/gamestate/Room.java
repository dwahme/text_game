package gamestate;

import java.util.HashMap;

public class Room 
{
    HashMap<String, Room> connections = new HashMap<String, Room>();
    String tmp = "Found!";

    //No args constructor
    public Room() 
    {
    }

    // Adds a room to another room's connections
    public void connectRoom(Room newRoom, String dir, String otherDir)
    {
        // Add the room to the connections
        this.connections.put(dir, newRoom);

        // Add this room to the other room's connections
        newRoom.connections.put(otherDir, this);
    }
}
