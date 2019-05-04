package cli;

public class CLI 
{
    public CLI() 
    {
        
    }
    //Prints a message to the console
    public static void WelcomeMessage()
    {
        System.out.println("Did you ever hear the tragedy of Darth Plagueis The Wise? I thought not. It’s not a story the Jedi would tell you. "
                + "\nIt’s a Sith legend. Darth Plagueis was a Dark Lord of the Sith, so powerful and so wise he could use the Force to influence the midichlorians to create life… He had such a knowledge of the dark side that he could even keep the ones he cared about from dying. "
                + "\nThe dark side of the Force is a pathway to many abilities some consider to be unnatural. "
                + "\nHe became so powerful… the only thing he was afraid of was losing his power, which eventually, of course, he did. "
                + "\nUnfortunately, he taught his apprentice everything he knew, then his apprentice killed him in his sleep. Ironic. "
                + "\nHe could save others from death, but not himself.");
    }

    public String process(String input)
    {
        if (input.equalsIgnoreCase("INVENTORY"))
        {
            System.out.println("You have nothing in your inventory.\n");
        }
        else if (input.equalsIgnoreCase("LOOK"))
        {
            System.out.println("You see an empty room with no doors.\n");
        }
        else
        {
            System.out.println("Unrecognized command: " + input + "\n");
        }

        return "> ";
    }
    
}
