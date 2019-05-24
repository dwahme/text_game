package gamestate;

public class GameState 
{
    Room currRoom = new Room();

    //No args constructor
    public GameState() 
    {
        System.out.println("built game state");

        Room tmpRoom = new Room();
        currRoom.connectRoom(tmpRoom, "north", "south");
        System.out.println(tmpRoom.connections.get("south").tmp);
    }
}
