public class Glavna {
    public static void main(String[] args) throws Exception {
        Datoteka datoteka = new Datoteka("test.txt");
        datoteka.writeToFile("Hello World!");
        datoteka.readFromFile();
    }
}
