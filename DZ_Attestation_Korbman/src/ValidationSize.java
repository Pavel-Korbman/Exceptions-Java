
import java.util.List;
import java.util.zip.DataFormatException;

public class ValidationSize {
    public static void ValidationSize(List<String> data) throws DataFormatException {
        if (data.size() < 6) throw new DataFormatException("Вы ввели меньше данных, чем требуется !");
        if (data.size() > 6) throw new DataFormatException("Вы ввели больше данных, чем требуется !");
    }
}
