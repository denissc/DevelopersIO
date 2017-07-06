import views.ConsoleHelper;

/**
 * App runner class
 */
public class AppRunner {

    public static void main(String[] args) {
        ConsoleHelper consoleHelper = new ConsoleHelper();

        while (! consoleHelper.isQuit()) {
            consoleHelper.renderMenu();
            consoleHelper.readUserInput();
            consoleHelper.handleUserInput();
        }
    }

}
