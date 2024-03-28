import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        arrayOutOfBoundsException();
//        divisionByZero();
        //numberFormatException();
        int[] a = new int[]{12, 8, 16};
        int[] b = new int[]{4, 2, 4};
//        System.out.println(Arrays.toString(subArrays(a, b)));
        System.out.println(Arrays.toString(divArrays(a, b)));


    }

    /**
     * 1 Задача
     * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
     * <p>
     * Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
     * <p>
     * Метод divisionByZero - Деление на 0
     * <p>
     * Метод numberFormatException - Ошибка преобразования строки в число
     * <p>
     * Важно: они не должны принимать никаких аргументов
     */
    public static void arrayOutOfBoundsException() {
        int[] arr = new int[10];
        System.out.println(arr[12]);
    }

    public static void divisionByZero() {
        int a = 3;
        int b = 0;
        int c = a / b;

    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        Integer arr = new Integer("one");
    }

    /**
     * 2 Задача
     * Реализуйте метод subArrays,
     * принимающий в качестве аргументов два целочисленных массива a и b,
     * и возвращающий новый массив c,
     * каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
     * <p>
     * Если длины массивов не равны - верните нулевой массив длины 1.
     * <p>
     * Напишите свой код в методе subArrays класса Answer.
     * Метод subArrays принимает на вход два параметра:
     * <p>
     * int[] a - первый массив
     * int[] b - второй массив
     * Пример:
     * a = new int[]{4, 5, 6};
     * b = new int[]{1, 2, 3};
     * <p>
     * Вывод: [3, 3, 3]
     * <p>
     * a = new int[]{4, 5, 6};
     * b = new int[]{1, 2, 3, 5};
     * <p>
     * Вывод: [0]
     */

    public static int[] subArrays(int[] a, int[] b) {
        int[] c = new int[a.length];
        if (a.length != b.length) return new int[]{0};
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
        }
        return c;

    }

    /**
     * 3 Задача
     * Реализуйте метод divArrays,
     * принимающий в качестве аргументов два целочисленных массива a и b,
     * и возвращающий новый массив с,
     * каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
     * <p>
     * Если длины массивов не равны - верните нулевой массив длины 1.
     * <p>
     * Важно: При выполнении метода единственное исключение,
     * которое пользователь может увидеть - RuntimeException, т.е. ваше.
     * <p>
     * Пример^
     * a = new int[]{12, 8, 16};
     * b = new int[]{4, 2, 4};
     * <p>
     * Вывод: [3, 4, 4]
     * <p>
     * a = new int[]{12, 8, 16, 25};
     * b = new int[]{4, 2, 4};
     * <p>
     * Вывод: [0]
     */
    public static int[] divArrays(int[] a, int[] b) {
        if (a.length != b.length) return new int[]{0};
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0) throw new RuntimeException("Деление на 0 - это не хорошо");
            c[i] = a[i] / b[i];
        }
        return c;
    }

}