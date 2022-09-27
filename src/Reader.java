import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public List<String> readFile() {
        List<String> records = new ArrayList<>();
        Path old = Paths.get("resources/preConditionsOld.txt");

        System.out.println("File to check: " + old);
        boolean exists = Files.exists(old);
        System.out.println("File to check exists: " + exists);

        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(old)));) {
            String line = reader.readLine();
            while (line != null) {
                records.add(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }

}
