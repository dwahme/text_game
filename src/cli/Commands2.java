package cli;

import java.util.HashSet;

public class Commands2 extends Commands1
{
    HashSet<String> param1 = new HashSet<String>();
    Boolean param1Wildcard = false;

    // Constructor with command as argument
    public Commands2(String twoParamCommand, String[] params0, String[] params1) 
    {
        super(twoParamCommand, params0);

        if (params1 != null)
        {
            for (String param: params1)
            {
                param1.add(param.toUpperCase());
            }
        }
        else
        {
            param1Wildcard = true;
        }
    }

    // Sees if the parameters are valid
    public Boolean ValidParams(String args)
    {
        // Split string into arguments
        String[] splits = args.trim().split("\\s+");

        if (splits.length == 3)
        {
            Boolean match0 = param0Wildcard || param0.contains(splits[1].toUpperCase());
            Boolean match1 = param1Wildcard || param1.contains(splits[2].toUpperCase());

            return match0 && match1;
        }

        return false;
    }
}
