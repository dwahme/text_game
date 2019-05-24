
package cli;

public class Commands0 
{
    private String noParamCommand;

    //No args constructor
    public Commands0() 
    {       
    } 

    public Commands0(String noParamCommand) 
    {
        this.noParamCommand = noParamCommand;
    }
    
    public Boolean isValidCommand(String candidateCommand)
    {
        if(candidateCommand.trim().equalsIgnoreCase(noParamCommand))
        {
           return true; 
        }
        
        return false;
    }
}
