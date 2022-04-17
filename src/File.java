import java.io.FileReader;
import java.util.*;

public class File {
    public List<String> ReadingFile () {
        String[] bolvanchikiData;
        StringBuilder bolvanchikiString = new StringBuilder("");
        try (FileReader reader = new FileReader("C:\\Users\\bekoi\\Desktop\\Players.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                bolvanchikiString.append((char) c);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        bolvanchikiData = bolvanchikiString.toString().split("\n");
        List<String> list = Arrays.asList(bolvanchikiData);
        Collections.shuffle(list);
        return list;
    }
}




