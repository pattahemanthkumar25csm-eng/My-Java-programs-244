import java.io.StringReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class LabProgram10 {

    // counts how many times 'pattern' appears in 'text'
    static int count(String text, String pattern) {
        int count = 0, idx = 0;
        while ((idx = text.indexOf(pattern, idx)) != -1) {
            count++;
            idx += pattern.length();
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        String[] lines = {
            "Peter Piper picked a peck of pickled peppers",
            "A peck of pickled peppers Peter Piper picked",
            "If Peter Piper picked a peck of pickled peppers",
            "Where's the peck of pickled peppers Peter Piper picked?"
        };

        // 1. Write the text to sample.txt
        try (PrintWriter pw = new PrintWriter(new FileWriter("sample.txt"))) {
            for (String line : lines) {
                pw.println(line);
            }
        }

        // 2. Read the file back
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        }

        // 3. Count the patterns (lowercase so "Pe" and "Pi" are also counted)
        String text = sb.toString().toLowerCase();
        System.out.println("'pe' - no of occurrences - " + count(text, "pe"));
        System.out.println("'pi' - no of occurrences - " + count(text, "pi"));
    }
}