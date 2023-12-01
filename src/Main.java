import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String filePath = "data/data1.txt";

        // Read and print the contents of the file
        try {
            List<String> lines = readFromFile(filePath);
            printFileContents(lines);
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    // Read the contents of the file into a List of Strings
    private static List<String> readFromFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        return Files.readAllLines(path);
    }

    // Print the contents of the file
    private static void printFileContents(List<String> lines) {
        System.out.println("File Contents:");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}