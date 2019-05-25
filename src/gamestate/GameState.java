package gamestate;

public class GameState 
{
    Room currRoom = new Room("light yelow");

    //No args constructor
    public GameState() 
    {
        System.out.println(currRoom.getDescription());

        currRoom.setDescription("dark yelow");

        System.out.println(currRoom.getDescription());
    }
}
