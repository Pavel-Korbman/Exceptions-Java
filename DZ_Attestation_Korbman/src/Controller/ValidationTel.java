package Controller;
import java.math.BigInteger;
import java.util.List;
import java.util.zip.DataFormatException;

public class ValidationTel {
    public static void ValidationTel(List<String> data) throws DataFormatException {
        if (data.get(4).length() == 10) {
            try {
                BigInteger tel = new BigInteger(data.get(4));
                System.out.println(tel);
            } catch (NumberFormatException e) {
                throw new NumberFormatException(" Телефон должен состоять только из цифр");
            }
        } else throw new DataFormatException("Номер телефона должен состоять из 10 цифр !");
    }
}
