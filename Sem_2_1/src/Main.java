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
String [][] array = new String[][]
    }

    /**
     * Задание №2
     * 📔 Обработайте возможные исключительные ситуации. “Битые” значения в
     * исходном массиве считайте нулями. Можно внести в код правки, которые считаете
     * необходимыми
     */

    public static int summ2d(String[][] arr) {
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 5; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }

            }
        } catch (InputMismatchException e){
            System.out.println("Один из элементов массива - не целое число");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Строки массива не должны быть длиннее пяти элементов");
        }

        return sum;

    }

}