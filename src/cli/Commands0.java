package cli;

public class Commands0
{
    private String CommandName;

    // Constructor with command as argument
    public Commands0(String noParamCommand) 
    {
        this.CommandName = noParamCommand;
    }
        
    // Sees if a command is valid
    public Boolean CommandMatches(String candidateCommand)
    {
        return candidateCommand.trim().equalsIgnoreCase(CommandName);
    }         
}
