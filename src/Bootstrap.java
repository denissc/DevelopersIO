import java.io.*;

/**
 * Created by denissc on 27.06.17.
 */
public class Bootstrap {

    public static void main(String[] args) {
        ConsoleHelper consoleHelper = new ConsoleHelper();

        while (! consoleHelper.isQuit()) {
            consoleHelper.renderMenu();
            consoleHelper.readUserInput();
            consoleHelper.handleUserInput();
        }
    }

}
