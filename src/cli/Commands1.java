package cli;

import java.util.HashSet;

public class Commands1 extends Commands0
{
    HashSet<String> param0 = new HashSet<String>();
    Boolean param0Wildcard = false;

    // Constructor with command as argument
    public Commands1(String oneParamCommand, String[] params) 
    {
        super(oneParamCommand);

        if (params != null)
        {
            for (String param: params)
            {
                param0.add(param.toUpperCase());
            }
        }
        else
        {
            param0Wildcard = true;
        }
    }

    // Sees if a command matches this command's name
    public Boolean CommandMatches(String args)
    {
        // Split string into arguments
        String[] splits = args.trim().split("\\s+");

        return super.CommandMatches(splits[0]);
    }

    // Sees if the parameters are valid
    public Boolean ValidParams(String args)
    {
        // Split string into arguments
        String[] splits = args.trim().split("\\s+");

        if (splits.length == 2)
        {
            return param0Wildcard ||
                param0.contains(splits[1].toUpperCase());
        }

        return false;
    }
}
