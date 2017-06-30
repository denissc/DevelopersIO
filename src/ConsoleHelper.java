import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Helper class that manipulates user console input
 */
public class ConsoleHelper {
    private final String CREATE_NEW_DEV_INPUT = "1";
    private final String EDIT_DEV = "2";
    private final String VIEW_DEV = "3";
    private final String DELETE_DEV = "4";
    private final String QUIT = "5";
    private final DeveloperController controller = new DeveloperController();
    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private boolean quit = false;
    private String userInput;

    /**
     * Render console menu
     */
    public void renderMenu() {
        System.out.println("__________________________");
        System.out.println("Menu :");
        System.out.println("==========================");
        System.out.println("1 - Create new Developer;");
        System.out.println("2 - Edit developer;");
        System.out.println("3 - View Developer info;");
        System.out.println("4 - Delete developer;");
        System.out.println("5 - Quit.");
        System.out.println("__________________________");
    }

    /**
     * Check if user chooses to quit
     * @return boolean
     */
    public boolean isQuit() {
        return quit;
    }

    /**
     * Read user input from console
     */
    public void readUserInput() {
        userInput = readInput();
    }

    /**
     * Handle user input one of menu options
     */
    public void handleUserInput() {
        String name,occupation;
        int developerId, age;
        Developer developer;

        switch (userInput){
            case CREATE_NEW_DEV_INPUT:
                name = readDeveloperName();
                occupation = readDeveloperOccupation();
                age = readDeveloperAge();
                controller.create(name, occupation, age);
                break;
            case EDIT_DEV:
                developerId = readDeveloperId();
                name = readDeveloperName();
                occupation = readDeveloperOccupation();
                age = readDeveloperAge();
                controller.update(developerId, name, occupation, age);
                break;
            case VIEW_DEV:
                developerId = readDeveloperId();
                developer = controller.findById(developerId);
                displayDeveloper(developer);
                break;
            case DELETE_DEV:
                developerId = readDeveloperId();
                controller.deleteById(developerId);
                break;
            case QUIT:
                quit = true;
                break;
            default:
                renderMenu();

        }
    }

    /**
     * Display developer data to console
     * @param developer
     */
    private void displayDeveloper(Developer developer) {
        System.out.println("Developer :");
        System.out.println("==========================");
        System.out.println("Name :" + developer.getName());
        System.out.println("Occupation :" + developer.getOccupation());
        System.out.println("Age :" + developer.getAge());
    }

    /**
     * Ask and read user to input developer id through console
     * @return int developer id
     */
    private int readDeveloperId() {
        System.out.println("Input Developer Id:");
        return readIntInput();
    }

    /**
     * Ask and read user input developer name though console
     * @return String developer name
     */
    private String readDeveloperName() {
        System.out.println("Input Developer Name:");
        return readInput();
    }

    /**
     * Ask and read user input developer age through console
     * @return int developer age
     */
    private int readDeveloperAge() {
        System.out.println("Input Developer Age:");
        return readIntInput();
    }

    /**
     * Ask and read user input developer occupation through console
     * @return String developer occupation
     */
    private String readDeveloperOccupation() {
        System.out.println("Input Developer Occupation:");
        return readInput();
    }

    /**
     * Read user input console string
     * @return String user input
     */
    private String readInput() {
        String input = null;
        do {
            try {
                input = bufferedReader.readLine();
            } catch (IOException e) {
                System.out.println("(INFO)Failed to read input. Try again.");
            }
        } while (input == null);

        return input;
    }

    /**
     * Read user input console integer
     * @return int user input
     */
    private int readIntInput() {
        int intInput = 0;
        boolean isInt = false;
        do {
            String input = readInput();
            try {
                intInput = Integer.parseInt(input);
                isInt = true;
            } catch (NumberFormatException e) {
                System.out.println("(INFO) Input must be a number. Try again.");
            }
        }while (! isInt);

        return intInput;
    }
}
