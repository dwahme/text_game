package gamestate;

import java.util.HashMap;

public class Room 
{
    HashMap<String, Room> connections = new HashMap<String, Room>();

    //No args constructor
    public Room() 
    {
    }

    // Sees if a room exists in a certain direction
    public Boolean roomExists(String dir)
    {
        return connections.containsKey(dir);
    }

    // Gets a room in a certain direction
    public Room getRoom(String dir)
    {
        return connections.get(dir);
    }

    // Connects two rooms (returns false if the new room is invalid)
    // Will overwrite the room in that direction
    public Boolean connectRoom(Room newRoom, String dir, String otherDir)
    {
        // Make sure the room is valid
        if (newRoom == null)
        {
            return false;
        }

        // Add the room to the connections
        this.connections.put(dir, newRoom);

        // Add this room to the other room's connections
        newRoom.connections.put(otherDir, this);

        return true;
    }
}
