import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class java_print {

    public static void main(String[] args) {
        // Print to console
        System.out.println("Hello, World!");

        // Save to a file with error handling
        try (PrintWriter writer = new PrintWriter("output.txt")) {
            writer.println("Hello, World!");
            System.out.println("Successfully saved to output.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Error: Output file not found - " + e.getMessage());
            e.printStackTrace();
        }
    }
}
