package Data;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
public class Data {
    public static void dataSave(List<String> data) {

        String fileName = data.getFirst() + ".txt";
        Person person = new Person(data.getFirst(), data.get(1), data.get(2), data.get(3), data.get(4), data.get(5));

        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.write(person.toString());
            fileWriter.append('\n');
            fileWriter.flush();
            System.out.println("Данные сохранены УСПЕШНО !");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
