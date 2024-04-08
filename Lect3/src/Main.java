/**
 * Продвинутая работа с исключениями в Java
 */

import java.io.*;
import java.lang.reflect.Type;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) {
        /**
         * Блок try-with-resources - автоматом закрывает открытые ресурсы
         *
         * При использовании внешних для JVM ресурсов, таких как файлы,
         * сетевые соединения, соединения с базами данных и прочие,
         * требуется обязательно закрывать их в блоке finally. Это связано с
         * тем, что если приложение аварийно завершит свою работу
         */


        /**
         *Чтение файла без try-with-resources
         */
//        FileReader test = null;
//        try {
//            test = new FileReader(new File("file.txt"));
//// Полезная работа, связанная с чтением файла.
//        } catch (RuntimeException | IOException e) {
//            System.out.println("catch exception: " + e.getClass().getSimpleName());
//        } finally {
//            try {
//                if (test != null) {
//                    test.close();  // Обязательно закрываем файл
//                }
//            } catch(IOException e) {
//                e.printStackTrace();
//            }
//            System.out.println("finally finished");
//        }

        /**
         *Чтение файла с try-with-resources
         */

//        try (BufferedReader test = new BufferedReader(new FileReader("file.txt"))) {
////            Ресурс в скобках будет закрыт по окончании блока try
//            String str;
//            while ((str = test.readLine()) != null) {
//                System.out.println(str);
//            }
//            // Полезная работа, связанная с чтением файла.
//        } catch (RuntimeException | IOException e) {
//            System.out.println("catch exception: " + e.getClass().getSimpleName());
//        } finally {
////            Не нужно закрывать открытые ресурсы
//            System.out.println("finally start");
//            System.out.println("finally finished");
//        }
//        String data = "9779225100";
//        try {
//            int tel = Integer.parseInt(data);
//            System.out.println(tel);
//        } catch (NumberFormatException e) {
//            System.out.println("Телефон должен состоять только из цифр");
//        }
//        String data = "9779225100";
//        int tel;
//        tel = Integer.parseInt(data);
//        System.out.println(tel);

        String tel = "89779225100r";
        BigInteger num = new BigInteger(tel);
//        int res = (int) Double.parseDouble(tel);
        System.out.println(num);



    }
}