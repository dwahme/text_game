package cli;

import actionmanagement.ActionManagement;

public class CLI 
{
    ActionManagement Manager = new ActionManagement();
    String[] commands = {"INVENTORY", "LOOK"};
    Boolean exit = false;
    String prompt = "> ";

    public CLI() 
    {

    }

    // Returns if we need to exit the game
    public Boolean endGame()
    {
        return exit;
    }

    // Gets the current prompt
    public void prompt()
    {
        System.out.print(prompt);
    }

    // Sees if a command is valid
    private Boolean isValidCommand(String input)
    {
        for (String command: this.commands)
        {
            if (input.trim().equalsIgnoreCase(command))
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
            this.exit = true;
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
