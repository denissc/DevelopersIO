import java.io.Serializable;

/**
 * Developer serializable POJO class
 */
public class Developer implements Serializable{
    private int id;
    private String name;
    private String occupation;
    private int age;

    /**
     * Construct new Developer class object by parameters
     * @param name developer name
     * @param occupation developer occupation
     * @param age developer age
     */
    Developer(String name, String occupation,int age){
        this.name = name;
        this.occupation = occupation;
        this.age = age;
    }

    /**
     * Sets developer name
     * @param name developer name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets developer occupation
     * @param occupation developer occupation
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * Sets developer age
     * @param age developer age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns developer name
     * @return developer name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns developer occupation
     * @return developer occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Returns developer age
     * @return developer age
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns string from developer fields
     * @return developer string data
     */
    @Override
    public String toString() {
        return " Name : " + this.name +
                " Country : " + this.occupation +
                " Age : " + this.age;
    }
}
