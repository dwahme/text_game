package cli;

import actionmanagement.ActionManagement;

public class CLI 
{
    ActionManagement Manager = new ActionManagement();
    
    // Holds all the possible commands we support
    Commands0 noParamCommand[] = {new Commands0("INVENTORY")};
    Commands1 oneParamCommand[] = 
    {
        new Commands1("LOOK", null),
        new Commands1("ATTACK", null),
        new Commands1("UNLOCK", null),
        new Commands1("WALK", new String[] {"NORTH", "SOUTH", "EAST", "WEST"})
    };
    Commands2 twoParamCommand[] = 
    {
        new Commands2("EQUIP", null, new String[] {"LEFT", "RIGHT", "BOTH"}),
        new Commands2("PICK", new String[] {"UP"}, null)
    };
    
    // Vars
    Boolean endGame = false;
    String prompt = "> ";

    // No args constructor
    public CLI() 
    {
    }

    // Returns if we need to exit the game
    public Boolean endGame()
    {
        return endGame;
    }

    // Gets the current prompt
    public void prompt()
    {
        System.out.print(prompt);
    }

    // Sees if a command is valid
    private Boolean isValidCommand(String input)
    {
        // Handles the validation for NoParamCommands
        for (Commands0 command0obj: this.noParamCommand)
        {
            if (command0obj.CommandMatches(input) == true)
            {
                return command0obj.ValidParams(input);
            }
        }
        
        for (Commands1 commmand1obj: this.oneParamCommand)
        {
            if (commmand1obj.CommandMatches(input) == true)
            {
                return commmand1obj.ValidParams(input);
            }
        }

        for (Commands2 commmand2obj: this.twoParamCommand)
        {
            if (commmand2obj.CommandMatches(input) == true)
            {
                return commmand2obj.ValidParams(input);
            }
        }

        return false;
    }

    // Processes a command
    public void process(String input)
    {
        // See if the command is one of the baseline commands
        if (input.equalsIgnoreCase("EXIT"))
        {
            System.out.println("Goodbye, adventurer.\n");
            this.endGame = true;
            return;
        }

        // Otherwise, attempt to process the command
        if (isValidCommand(input))
        {
            Manager.process(input);
        }
        else
        {
            System.out.println("Unrecognized command: " + input + "\n");
        }
    }    
}
