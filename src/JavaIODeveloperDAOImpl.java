import java.io.*;
import java.util.ArrayList;

/**
 * Developer DAO crud operations thought file
 */
public class JavaIODeveloperDAOImpl implements DeveloperDAO{
    private File file = new File(System.getProperty("user.dir") + "/src/developers.txt");
    private ArrayList<Developer> developers = new ArrayList<>();

    /**
     * Returns new class instance and reads stored developers data
     */
    JavaIODeveloperDAOImpl() {
        readDevelopers();
    }

    /**
     * Return developer founded by id
     * @param developerId developer id
     * @return founded developer or null if it is not founded
     */
    @Override
    public Developer findById(int developerId) {
        if (developerId < 0 || developerId  >= developers.size()) {
            System.out.println("(INFO) Developer not exists.");
            return null;
        } else {
            return developers.get(developerId);
        }
    }

    /**
     * Saves new developer to the file
     * @param developer new developer
     */
    @Override
    public void save(Developer developer) {
        developers.add(developer);
        writeDevelopers();
    }

    /**
     * Updates existed developer by it id, rewrites the file
     * @param developerId developer id that needs update
     * @param developer new developer data
     */
    @Override
    public void update(int developerId, Developer developer) {
        if (developerId < 0 || developerId  >= developers.size()) {
            System.out.println("(INFO) Developer not exists.");
        } else {
            developers.set(developerId, developer);
            writeDevelopers();
        }
    }

    /**
     * Delete existed developer by id, and rewrite the file
     * @param developerId developer id
     */
    @Override
    public void deleteById(int developerId) {
        if (developerId < 0 || developerId  >= developers.size()) {
            System.out.println("(INFO) Developer not exists.");
        } else {
            developers.remove(developerId);
            writeDevelopers();
        }
    }

    /**
     * Reads developers data from the file, and add them to developers collection
     */
    private void readDevelopers() {
        try(ObjectInput src =
                    new ObjectInputStream(
                            new BufferedInputStream(
                                    new FileInputStream(file)))){

            developers.addAll((ArrayList<Developer>)src.readObject());
        } catch (EOFException e) {
            System.out.println("(INFO) No developers data found.");
        } catch(Exception e) {
            System.out.println("(FATAL) Failed to read developers data.");
        }
    }

    /**
     * Write developers collection to the file
     */
    private void writeDevelopers() {
        try(ObjectOutput destination =
                    new ObjectOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(file)))) {

            destination.writeObject(developers);
        } catch (IOException e) {
            System.out.println("(FATAL) Failed to save developers data.");
        }
    }

}
