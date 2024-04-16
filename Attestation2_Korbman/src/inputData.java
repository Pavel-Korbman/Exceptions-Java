import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class inputData {
    public static ArrayList<String> inputData(String fileName) {
        ArrayList<String> arrayList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String str;
            while ((str = reader.readLine()) != null) {
                arrayList.addAll(List.of(str.split(" ")));
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
        return arrayList;
    }

}
