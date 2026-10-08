import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        String fileName = "io_demo.txt";

        // 1. Writing to a file using BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Line 1: Welcome to java.io operations.");
            writer.newLine(); // Platform-independent newline (\n or \r\n)
            writer.write("Line 2: Character streams are great for text.");
            System.out.println("Successfully written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }

        // 2. Reading from the file using BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String currentLine;
            System.out.println("\n--- Reading File Contents ---");
            // readLine() returns null when it reaches the end of the file
            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
