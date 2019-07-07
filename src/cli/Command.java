package cli;
import java.util.HashSet;
import java.util.ArrayList;

public class Command
{
    private String CommandName;
    private ArrayList<HashSet<String>> argSets = new ArrayList<HashSet<String>>();

    // Constructor with command as argument
    public Command(String command) 
    {
        // Set the command name for this command
        this.CommandName = command.toUpperCase();
    }

    // Increases the number of parameters for the command by 1,
    // and allows specifying which possible arguments for that parameter
    // are valid. If no arguments are specified, then any string is
    // valid for the parameter
    public Command addParam(String... possibleParams)
    {
        // See if it's a wildcard argument or a set number of args
        if (possibleParams.length > 0)
        {
            // Set of possible args
            HashSet<String> argSet = new HashSet<String>();
            argSets.add(argSet);

            for (String arg: possibleParams)
            {
                argSet.add(arg.toUpperCase());
            }
        }
        else
        {
            // Wildcard argument (any argument is valid for this parameter)
            argSets.add(null);
        }

        return this;
    }

    // Sees if a command matches this command's name
    public Boolean commandMatches(String input)
    {
        // Split string into its words
        String[] splits = input.trim().split("\\s+");

        return splits[0].equalsIgnoreCase(CommandName);
    }

    // Sees if the full command is valid (command and parameters)
    public Boolean validParams(String input)
    {
        // Default if no parameters
        Boolean matches = true;

        // Split string into a list of strings, splitting on spaces
        String[] splits = input.trim().split("\\s+");

        // See if we have the right number of arguments
        if (splits.length != argSets.size() + 1)
        {
            return false;
        }

        // Go through the argSets and see if we match or get a wildcard arg
        int idx = 1;
        for (HashSet<String> argSet: argSets)
        {
            if (argSet != null)
            {
                Boolean inArgSet = argSet.contains(splits[idx].toUpperCase());
                matches = matches && (inArgSet);
            }
            // Else is a wildcard argument (any argument is valid for this parameter)

            idx++;
        }

        return matches;
    }
}
