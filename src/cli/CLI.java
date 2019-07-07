package cli;

import java.util.HashMap;
import actionmanagement.ActionManagement;

public class CLI 
{
    ActionManagement Manager = new ActionManagement();

    HashMap<String, Command> commands;
    
    // Vars
    Boolean endGame = false;
    String prompt = "> ";

    // No args constructor
    public CLI() 
    {
        addCommands();
    }

    // Makes the set of possible commands
    private void addCommands()
    {
        commands = new HashMap<String, Command>();

        // 0 param commands
        commands.put("INVENTORY", new Command("INVENTORY"));
        
        // 1 param commands
        commands.put("LOOK", new Command("LOOK").addParam());
        commands.put("ATTACK", new Command("ATTACK").addParam());
        commands.put("UNLOCK", new Command("UNLOCK").addParam());
        commands.put("WALK",
            new Command("WALK").addParam("NORTH", "SOUTH", "EAST", "WEST"));

        // 2 param commands
        commands.put("EQUIP", 
            new Command("EQUIP").addParam().addParam("LEFT", "RIGHT", "BOTH"));
        commands.put("PICK", 
            new Command("PICK").addParam("UP").addParam());
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
        Command command = commands.get(words[0].toUpperCase());

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
            Manager.process(input);
        }
        else
        {
            System.out.println("Unrecognized command: " + input + "\n");
        }
    }    
}
