import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
public class Data {
    public static void dataSave(List<String> data) {
        String fileName = data.getFirst() + ".txt";
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.write(data.getFirst());
            fileWriter.append(' ');
            fileWriter.write(data.get(1));
            fileWriter.append(' ');
            fileWriter.write(data.get(2));
            fileWriter.append(' ');
            fileWriter.write(data.get(3));
            fileWriter.append(' ');
            fileWriter.write(data.get(4));
            fileWriter.append(' ');
            fileWriter.write(data.get(5));
            fileWriter.append('\n');
            fileWriter.flush();
            System.out.println("Данные сохранены УСПЕШНО !");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
