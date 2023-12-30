import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter text");

        Scanner scanner = new Scanner(System.in);

        StringBuilder inputText = new StringBuilder();
        while(true) {
            String line = scanner.nextLine();
            if(line.isEmpty()) {
                break;
            }
            inputText.append(line).append("\n");
        }

        System.out.println("Text: ");
        System.out.println(inputText.toString());
        scanner.close();
    }
}
