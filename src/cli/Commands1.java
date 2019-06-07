package cli;

import java.util.HashSet;

public class Commands1 extends Commands0
{
    HashSet<String> param0 = new HashSet<String>();

    // Constructor with command as argument
    public Commands1(String oneParamCommand, String[] params) 
    {
        super(oneParamCommand);
    }

    // Sees if a command is valid for this command
    public Boolean CommandMatches(String candidateCommand)
    {
        return super.CommandMatches(candidateCommand);
    }         
}
