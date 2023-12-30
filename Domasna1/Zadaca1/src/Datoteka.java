import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Datoteka {
    private String fileName;
    private FileInputStream inputStream;
    private FileOutputStream outputStream;

    public Datoteka(String fileName) {
        this.fileName = fileName;
        try {
            this.inputStream = new FileInputStream(fileName);
            this.outputStream = new FileOutputStream(fileName, true);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
        }
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }   

    public void writeToFile(String text) {
        try {
            byte[] bytes = text.getBytes();
            outputStream.write(bytes);
            System.out.println("Text written to file: " + text);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void readFromFile() {
        try {
            int ch;
            while ((ch = inputStream.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
