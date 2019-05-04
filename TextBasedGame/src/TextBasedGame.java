import cli.CLI;
import java.util.Scanner;

public class TextBasedGame 
{

    public static void main(String[] args) 
    {
        CLI Shell = new CLI();

        Scanner Scan = new Scanner(System.in);
        Boolean exit = false;

        System.out.print("Greetings, adventurer.\n\n> ");

        while (exit == false)
        {
            // Get and process user input
            String line = Scan.nextLine();

            if (line.equalsIgnoreCase("EXIT"))
            {
                System.out.println("Goodbye, adventurer.\n");
                exit = true;
            }
            else
            {
                String prompt = Shell.process(line);

                System.out.print(prompt);
            }
        }
    }
}
