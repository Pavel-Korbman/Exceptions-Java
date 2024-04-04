import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[10];
//        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1: ");
//
//        try {
//            int index = scanner.nextInt();
//            arr[index] = 1;
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Указан элемент за пределами массива " + e.getClass());
//        } catch (InputMismatchException e){
//        System.out.println("Индекс должен быть целым числом " + e.getClass());}

//        String[][] array = {{"1", "2", "3"},{"b", "2", "2"}, {"3", "2n", "1"}};
//        System.out.println(summ2d(array));

        /**
         * Исправьте код, примените
         * подходящие способы
         * обработки исключений.

         public static void main(String[] args) {
         InputStream inputStream;
         try {
         String[] strings = {"asdf", "asdf" };
         String strings1 = strings[2];
         test();
         int a = 1 / 0;
         inputStream = new FileInputStream("adafqdsaf");
         } catch (Throwable e) {
         e.printStackTrace();
         } catch (StackOverflowError error) {
         System.out.println("asdfasdfdsa");
         } finally {
         System.out.println("Я всё равно выполнился!");
         }
         System.out.println("Я жив!");
         }

         public static void test() throws IOException {
         File file = new File("1");
         file.createNewFile();
         FileReader reader = new FileReader(file);
         reader.read();
         test();
         } */
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "asdf" };
            String strings1 = strings[2]; // Выход за пределы массива
            test(); // Переполнение стека рекурсией
            int a = 1 / 0; // Деление на ноль
            inputStream = new FileInputStream("adafqdsaf"); // Ошибка ввода вывода
            /*
            Строки выше с разными видами исключений надо поместить в разные блоки try - catch
             */
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за пределы массива");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я всё равно выполнился!");
        }
        System.out.println("Я жив!");
    }

    public static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}

/**
 * Задание №2
 * 📔 Обработайте возможные исключительные ситуации. “Битые” значения в
 * исходном массиве считайте нулями. Можно внести в код правки, которые считаете
 * необходимыми
 * <p>
 * public static int summ2d(String[][] arr) {
 * int sum = 0;
 * for (int i = 0; i < arr.length; i++) {
 * for (int j = 0; j < 5; j++) {
 * int val = Integer.parseInt(arr[i][j]);
 * sum += val;
 * }
 * }
 * return sum;
 * }
 * <p>
 * Исправьте код, примените
 * подходящие способы
 * обработки исключений.
 * <p>
 * Исправьте код, примените
 * подходящие способы
 * обработки исключений.
 * <p>
 * Исправьте код, примените
 * подходящие способы
 * обработки исключений.
 * <p>
 * Исправьте код, примените
 * подходящие способы
 * обработки исключений.
 */

//    public static int summ2d(String[][] arr) {
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                try {
//                    int val = Integer.parseInt(arr[i][j]);
//                    sum += val;
//                } catch (NumberFormatException e) {
//                    System.out.println("Не удалось перевести элемент из строки в целое число");
//                    sum += 0;
//                }
//            }
//        }
//        return sum;
//    }
//
//}

/**
 * Исправьте код, примените
 * подходящие способы
 * обработки исключений.
 *
 *
 */

