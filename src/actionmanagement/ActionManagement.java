package actionmanagement;

import gamestate.GameState;

public class ActionManagement 
{
    GameState _game;

    //No args constructor
    public ActionManagement(GameState game)
    {
        this._game = game;
    }

    // High level command processor
    public void process(String input)
    {
        if (input.equalsIgnoreCase("INVENTORY"))
        {
            System.out.println("You have nothing in your inventory.\n");
            return;
        }
        else if (input.equalsIgnoreCase("LOOK"))
        {
            System.out.println("You see an empty room with no doors.\n");
            return;
        }
        
        System.out.println("ACTION MANAGER ERROR- " + input + " not handled\n");
    }
    
}
