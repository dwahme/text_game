package actionmanagement;

public class ActionManagement 
{
    public ActionManagement()
    {

    }

    // High level command processor
    public void process(String input)
    {
        if (input.equalsIgnoreCase("INVENTORY"))
        {
            System.out.println("You have nothing in your inventory.\n");
            return;
        }
        else if (input.equalsIgnoreCase("LOOK"))
        {
            System.out.println("You see an empty room with no doors.\n");
            return;
        }

        System.out.println("ACTION MANAGER ERROR- " + input + " not handled");
    }
}
