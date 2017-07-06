import dao.DeveloperDAO;
import dao.JavaIODeveloperDAOImpl;
import models.Developer;

/**
 * Java IO app test
 */
public class AppTest {
    public static void main(String[] args) {
        DeveloperDAO<Developer> j = new JavaIODeveloperDAOImpl();

        j.save(new Developer(1,"111111111111111111111111111111111111111111111111111111111","1",1));
        j.save(new Developer(2,"2","2",2));
        j.save(new Developer(3,"3","3",3));
        j.save(new Developer(3,"3","3",3));

        Developer d = j.findById(1);
        System.out.println(d);

        j.update(new Developer(2,"22","22",22));

        d = j.findById(2);
        System.out.println(d);

        j.delete(d);
        d = j.findById(2);
        System.out.println(d);
    }
}
