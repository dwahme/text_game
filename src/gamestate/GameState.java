package gamestate;

public class GameState 
{
    Room currRoom = new Room("light yellow");

    //No args constructor
    public GameState() 
    {
        System.out.println(currRoom.getDescription());

        currRoom.setDescription("dark yellow");

        System.out.println(currRoom.getDescription());
    }
}
