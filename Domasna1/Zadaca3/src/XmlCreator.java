import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlCreator {
    public XmlCreator() {}

    public void createXml(String fileName, List<Student> studenti) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();
            Element root = doc.createElement("Studenti");
            doc.appendChild(root);
            int id = 0;
            for (Student s : studenti) {
                Element student = doc.createElement("Student");
                student.setAttribute("id", Integer.toString(id));
                root.appendChild(student);
                Element ime = doc.createElement("Ime");
                ime.appendChild(doc.createTextNode(s.getIme()));
                student.appendChild(ime);
                Element prezime = doc.createElement("Prezime");
                prezime.appendChild(doc.createTextNode(s.getPrezime()));
                student.appendChild(prezime);
                Element indeks = doc.createElement("Indeks");
                indeks.appendChild(doc.createTextNode(s.getIndeks()));
                student.appendChild(indeks);
                id++;
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);

            StreamResult result = new StreamResult(new File(fileName));
            transformer.transform(source, result);
            System.out.println("Xml file created");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
