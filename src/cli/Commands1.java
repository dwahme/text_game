package cli;

public class Commands1 extends CLI
{
    private String oneParamCommand;   
    private String[] parametersArray = new String[4];
    
    //No args constructor
    public Commands1() 
    {
    }
   
    public Commands1(String oneParamCommand, String[] parametersArray)
    {
        this.oneParamCommand = oneParamCommand;
        this.parametersArray = parametersArray;
    }
    
    
    
    //Sees if a command is valid
    public Boolean isValidOneParamCommand(String candidateCommand)
    {
        if(candidateCommand.trim().equalsIgnoreCase(oneParamCommand))
        {
           return true; 
        }
        
        return false;
    }
    
}
