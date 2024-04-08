import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.zip.DataFormatException;


public class Main {
    public static void main(String[] args) throws DataFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите по русски через пробел:");
        System.out.println("Фамилию Имя Отчество Дату_рождения(дд.мм.гггг) " +
                "Номер_телефона(только 10 цифр без пробелов) Пол(м или ж): ");
        String str = scanner.nextLine();
        List<String> data = new ArrayList<>(List.of(str.split(" ")));

        if (data.size() < 6) throw new DataFormatException("Вы ввели меньше данных, чем требуется !");
        if (data.size() > 6) throw new DataFormatException("Вы ввели больше данных, чем требуется !");
//        System.out.println(data);
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
//                int tel = Integer.parseInt(data.get(4));
                BigInteger tel = new BigInteger(data.get(4));
                System.out.println(tel);
            } catch (NumberFormatException e) {
                System.out.println("Телефон должен состоять только из цифр");
            }
        } else throw new DataFormatException("Номер телефона должен состоять из 10 цифр !");

        if (data.get(5).equalsIgnoreCase("м") | data.get(5).equalsIgnoreCase("ж")) {
            System.out.println(data.get(5));
        } else throw new DataFormatException("Небинарным личность вход закрыт! Пол только м или ж .");

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