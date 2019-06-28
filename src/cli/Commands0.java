package cli;

public class Commands0
{
    protected String CommandName;

    // Constructor with command as argument
    public Commands0(String noParamCommand) 
    {
        this.CommandName = noParamCommand;
    }

    // Sees if a command matches this command's name
    public Boolean CommandMatches(String args)
    {
        return args.trim().equalsIgnoreCase(CommandName);
    }

    // Sees if the full command is valid (command and parameters)
    public Boolean ValidParams(String args)
    {
        return true;
    }
}
