import java.util.List;

public class Main {
    public static void main(String[] args) {


        Writer writer = new Writer();
        Reader reader = new Reader();
        Parser parser = new Parser();

        List<String> records = reader.readFile();
        for (String record : records) {
            System.out.println(record);
        }

        System.out.println();

        List<String> parsedRecords = parser.parseRecords(records);
        for (String parsedRecord : parsedRecords) {
            System.out.println(parsedRecord);
        }

        writer.writeFile(parsedRecords);


    }
}