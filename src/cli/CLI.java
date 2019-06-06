package cli;

import actionmanagement.ActionManagement;

public class CLI 
{
    ActionManagement Manager = new ActionManagement();
    
    // Holds the commands that have no arguments
    Commands0 noParamCommand[] = {new Commands0("INVENTORY")};
    
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
            if(command0obj.CommandMatches(input) == true)
            {
                return true;
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
