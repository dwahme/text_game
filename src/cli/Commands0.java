package cli;

public class Commands0
{
    private String noParamCommand;

    // Constructor with command as argument
    public Commands0(String noParamCommand) 
    {
        this.noParamCommand = noParamCommand;
    }
    
    
    // Sees if a command is valid
    public Boolean isValidNoParamCommand(String candidateCommand)
    {
        if(candidateCommand.trim().equalsIgnoreCase(noParamCommand))
        {
           return true; 
        }
        return false;
    }
}
