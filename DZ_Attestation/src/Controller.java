import java.math.BigInteger;
import java.util.List;
import java.util.zip.DataFormatException;

public class Controller {
    public static void validationData(List<String> data) throws DataFormatException {

//        if (data.size() < 6) throw new DataFormatException("Вы ввели меньше данных, чем требуется !");
//        if (data.size() > 6) throw new DataFormatException("Вы ввели больше данных, чем требуется !");


        System.out.println("Ваши данные:");
        if (data.getFirst().length() >= 2) System.out.println(data.getFirst());
        else throw new DataFormatException("Слишком короткая фамилия !");

        if (data.get(1).length() >= 2) System.out.println(data.get(1));
        else throw new DataFormatException("Слишком короткое имя !");

        if (data.get(2).length() >= 2) System.out.println(data.get(2));
        else throw new DataFormatException("Слишком короткое отчество !");

        if (data.get(3).length() == 10) System.out.println(data.get(3));
        else throw new DataFormatException("Не корректный ввод даты !");

        if (data.get(4).length() == 10) {
            try {
                BigInteger tel = new BigInteger(data.get(4));
                System.out.println(tel);
            } catch (NumberFormatException e) {
                System.out.println(" Телефон должен состоять только из цифр");
            }
        } else throw new DataFormatException("Номер телефона должен состоять из 10 цифр !");

        if (data.get(5).equalsIgnoreCase("м") | data.get(5).equalsIgnoreCase("ж")) {
            System.out.println(data.get(5));
        } else throw new DataFormatException("Небинарным личность вход закрыт! Пол только м или ж .");

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
