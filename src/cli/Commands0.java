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
    public Boolean CommandMatches(String candidateCommand)
    {
        return candidateCommand.trim().equalsIgnoreCase(CommandName);
    }         
}
