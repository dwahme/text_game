package cli;

import java.util.HashMap;
import actionmanagement.ActionManagement;

public class CLI 
{
    ActionManagement _manager;
    HashMap<String, Command> _commands;
    
    // Vars
    Boolean endGame = false;
    String prompt = "> ";

    // No args constructor
    public CLI(ActionManagement manager, HashMap<String, Command> commands) 
    {
        this._manager = manager;
        this._commands = commands;
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
        // Split the input into a list of words
        String[] words = input.trim().split("\\s+");

        // Find the associated command
        Command command = _commands.get(words[0].toUpperCase());

        if (command != null)
        {
            return command.validParams(input);
        }
        
        // Command not found
        return false;
    }

    // Processes a command
    public void process(String input)
    {
        // if input is whitepsace
        if (input.trim().length() == 0)
        {
            return;
        }

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
            _manager.process(input);
        }
        else
        {
            System.out.println("Unrecognized command: " + input + "\n");
        }
    }    
}
