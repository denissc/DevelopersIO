package models;

import java.io.Serializable;

/**
 * Developer POJO class
 */
public class Developer {
    private int id;
    private String name;
    private String occupation;
    private int age;

    public Developer(){
        this(0,"","",0);
    }

    public Developer(int id) {
        this(id,"","",0);
    }
    /**
     * Construct new Developer class object by parameters
     * @param name developer name
     * @param occupation developer occupation
     * @param age developer age
     */
    public Developer(int id, String name, String occupation,int age){
        this.id = id;
        this.name = name;
        this.occupation = occupation;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return " Developer [Id :" + id +
                " Name : " + name +
                " Country : " + occupation +
                " Age : " + age + "]";
    }
}
