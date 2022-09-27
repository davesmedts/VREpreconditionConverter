import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Writer {

    public void writeFile(List<String> newPreConditions) {

        Path newPreConditionsFile = Paths.get("resources/preConditionsNew.txt");
        try (FileWriter writer = new FileWriter(newPreConditionsFile.toFile())) {
            StringBuilder builder = new StringBuilder();
            for (String newPreCondition : newPreConditions) {
                builder.append(String.format("%s%n", newPreCondition));
            }

            writer.write(builder.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
