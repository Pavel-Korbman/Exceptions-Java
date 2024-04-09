package Controller;
import Data.Data;
import java.math.BigInteger;
import java.util.List;
import java.util.zip.DataFormatException;

public class Controller {
    public static void validationData(List<String> data) throws DataFormatException {

        ValidationSize.ValidationSize(data);
        System.out.println("Ваши данные:");
        ValidationName.ValidationName(data);
        ValidationDay.ValidationDay(data);
        ValidationTel.ValidationTel(data);
        ValidationGender.ValidationGender(data);

        if (data.size() == 6
                && data.getFirst().length() >= 2
                && data.get(1).length() >= 2
                && data.get(2).length() >= 2
                && data.get(3).length() == 10
                && data.get(4).length() == 10
                && data.get(5).equalsIgnoreCase("м") | data.get(5).equalsIgnoreCase("ж")
                && new BigInteger(data.get(4)) != null) {
            Data.dataSave(data);
        }
    }
}
