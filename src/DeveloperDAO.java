/**
 * Developer DAO for crud operations
 */
public interface DeveloperDAO {

    /**
     * Return developer founded by id
     * @param id developer id
     * @return founded developer
     */
    public Developer findById (int id);

    /**
     * Saves new developer
     * @param developer new developer
     */
    public void save(Developer developer);

    /**
     * Updates existed developer by it id
     * @param developerId developer id that needs update
     * @param developer new developer data
     */
    public void update(int developerId, Developer developer);

    /**
     * Delete existed developer by id
     * @param developerId developer id
     */
    public void deleteById(int developerId);

}
