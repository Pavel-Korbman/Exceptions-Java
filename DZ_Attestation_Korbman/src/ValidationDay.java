
import java.util.List;
import java.util.zip.DataFormatException;

public class ValidationDay {
    public static void ValidationDay(List<String> data) throws DataFormatException {
        if (data.get(3).length() == 10) System.out.println(data.get(3));
        else throw new DataFormatException("Не корректный ввод даты !");
    }
}
