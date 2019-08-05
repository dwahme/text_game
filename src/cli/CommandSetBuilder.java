package cli;

import java.util.HashMap;

public class CommandSetBuilder
{
    // No args constructor
    public CommandSetBuilder()
    {
    
    }

    // Makes the set of possible commands
    public HashMap<String, Command> getCommands()
    {
        HashMap<String, Command> commands = new HashMap<String, Command>();

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

        return commands;
    }
}