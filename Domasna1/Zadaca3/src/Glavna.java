import java.util.ArrayList;
import java.util.List;

public class Glavna {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Andrej", "Tosheski", "INKI932");
        Student student2 = new Student("Angela", "Petreska", "INKI632");
        Student student3 = new Student("Borjan", "Dimitrijeski", "INKI854");

        List<Student> studenti = new ArrayList<>();
        studenti.add(student1);
        studenti.add(student2);
        studenti.add(student3);
        XmlCreator xmlCreator = new XmlCreator();

        xmlCreator.createXml("studenti.xml", studenti);
    }
}
