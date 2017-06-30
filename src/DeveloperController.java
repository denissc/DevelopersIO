/**
 * Class that controls Developer DAO
 */
public class DeveloperController {

    private final DeveloperDAO developerDAO = new JavaIODeveloperDAOImpl();

    /**
     * Creates new developer and saves it.
     * @param name developer name
     * @param occupation developer occupation
     * @param age developer age
     */
    public void create(String name, String occupation, int age) {
        developerDAO.save(new Developer(name,occupation,age));
    }

    /**
     * Updates exist developer parameters by it id
     * @param developerId developer id
     * @param name developer name
     * @param occupation developer occupation
     * @param age developer age
     */
    public void update(int developerId, String name, String occupation, int age) {
        Developer developer = developerDAO.findById(developerId);
        developer.setName(name);
        developer.setOccupation(occupation);
        developer.setAge(age);
        developerDAO.update(developerId, developer);
    }

    /**
     * Returns developer founded by id
     * @param developerId developer id
     * @return founded developer or null if it is not found
     */
    public Developer findById(int developerId) {
        return developerDAO.findById(developerId);
    }

    /**
     * Deletes exits developer by id
     * @param developerId developer id
     */
    public void deleteById(int developerId) {
        developerDAO.deleteById(developerId);
    }
}
