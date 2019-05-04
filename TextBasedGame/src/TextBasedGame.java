import cli.CLI;
import java.util.Scanner;

public class TextBasedGame 
{

    public static void main(String[] args) 
    {
        CLI Shell = new CLI();

        Scanner Scan = new Scanner(System.in);
        System.out.print("Greetings, adventurer.\n\n");

        while (Shell.endGame() == false)
        {
            Shell.prompt();

            // Get and process user input
            String line = Scan.nextLine();
            Shell.process(line);
        }
    }
}
