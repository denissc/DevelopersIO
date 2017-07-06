package dao;

/**
 * Developer DAO for crud operations
 */
public interface DeveloperDAO<E> {

    /**
     * Return developer founded by id
     * @param id developer id
     * @return founded developer
     */
    E findById (int id);

    /**
     * Saves new developer
     * @param developer new developer
     */
    void save(E developer);

    /**
     * Updates existed developer by it id
     * @param developer new developer data
     */
    void update(E developer);

    /**
     * Delete existed developer
     * @param developer developer
     */
    void delete(E developer);
}
