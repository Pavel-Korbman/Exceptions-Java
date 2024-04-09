import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class View {
    public static void inputData() throws DataFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите по русски через пробел:");
        System.out.println("Фамилию Имя Отчество Дату_рождения(дд.мм.гггг) " +
                "Номер_телефона(только 10 цифр без пробелов) Пол(м или ж): ");
        String str = scanner.nextLine();
        List<String> data = new ArrayList<>(List.of(str.split(" ")));
        Controller.validationData(data);
    }
}
