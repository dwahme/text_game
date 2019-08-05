import java.util.Scanner;
import actionmanagement.ActionManagement;
import cli.CLI;
import cli.CommandSetBuilder;
import gamestate.GameState;

public class TextBasedGame 
{
    public static void main(String[] args) 
    {
        GameState game = new GameState();
        ActionManagement manager = new ActionManagement(game);

        CommandSetBuilder commands = new CommandSetBuilder();
        CLI shell = new CLI(manager, commands.getCommands());

        Scanner scan = new Scanner(System.in);
        System.out.print("Greetings, adventurer.\n\n");

        while (shell.endGame() == false)
        {
            shell.prompt();

            // Get and process user input
            String line = scan.nextLine();
            shell.process(line);
        }

        scan.close();
    }
}
