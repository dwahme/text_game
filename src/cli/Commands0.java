package cli;

public class Commands0 extends CLI
{
    private String noParamCommand;

    //No args constructor
    public Commands0() 
    {       
    }

    //Constructor with command as argument
    public Commands0(String noParamCommand) 
    {
        this.noParamCommand = noParamCommand;
    }
    
    //Sees if a command is valid
    public Boolean isValidNoParamCommand(String candidateCommand)
    {
        if(candidateCommand.trim().equalsIgnoreCase(noParamCommand))
        {
           return true; 
        }
        
        return false;
    }
}
