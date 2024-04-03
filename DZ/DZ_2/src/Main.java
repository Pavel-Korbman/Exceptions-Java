import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String input = "3.14";
//        float result = IsFloat.isFloat(input);
//        System.out.println(result);

//        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 0};
//        int d = 0;
//        double result = Expr.expr(intArray, d);
//        System.out.println(result);

//        int a = 12;
//        int b = 0;
//        double result = Expr.expr(a, b);
//        System.out.println(result);

        char a = ' ';
        try {
            String result = Expr.expr(a);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }


    }
}

/**
 * Напишите программу, которая проверяет, является ли введенная текстовая строка числом с плавающей точкой (float).
 * Программа пытается преобразовать введенную строку в число float, и если это успешно, она выводит полученное число.
 * Если преобразование не удалось, программа выдаёт сообщение об ошибке
 * Your input is not a float number. Please, try again.
 * и возвращает специальное значение Float.NaN, чтобы обозначить ошибку.
 * <p>
 * Напишите программу, которая вычисляет значение выражения intArray[8] / d, гдеintArray- массив целых чисел, а d - делитель.
 * Программа проверяет, имеется ли в массиве intArray элемент с индексом 8, и если нет, выводит сообщение о невозможности выполнения операции.
 * Также программа проверяет, равен ли делитель d нулю, и если да, выводит соответствующее сообщение.
 * <p>
 * На входе:
 * '1 2 3 4 5 6 7 8 9'
 * '1'
 * На выходе:
 * intArray[8] / d = 9 / 1 = 9.0
 * 9.0
 * <p>
 * После запуска программы, если не переданы аргументы командной строки, то intArray будет {0, 1, 2, 3, 4, 5, 6, 7, 8, 9} и d будет равно 0. В этом случае результат выражения intArray[8] / d будет бесконечность (так как деление на 0).
 * Таким образом, программа выведет сообщение:
 * <p>
 * It's not possible to evaluate the expression - intArray[8] / d as d = 0.
 * NaN
 * <p>
 * Программа должна выдавать следующие ошибки:
 * <p>
 * Если длина массива меньше 9:
 * It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.
 * <p>
 * В этом случае, если массив имеет меньше 9 элементов, программа сообщает, что не удается вычислить выражение, так как в массиве нет 8-го элемента.
 * <p>
 * Если d равно 0:
 * It's not possible to evaluate the expression - intArray[8] / d as d = 0.
 * <p>
 * Если d равно 0, программа сообщает, что не удается вычислить выражение, так как деление на 0 невозможно.
 * <p>
 * Напишите программу для выполнения арифметической операции деления двух целых чисел a и b.
 * При этом программа должна проверить, что делитель b не равен нулю, и выполнить деление только в этом случае.
 * Если b равен нулю, программа должна вернуть результат равный нулю.
 * После выполнения операции деления, программа также должна вывести сумму чисел a и b с помощью метода printSum.
 * Если аргументы не переданы через командную строку, используйте значения по умолчанию.
 * <p>
 * На входе:
 * '12'
 * '5'
 * На выходе:
 * 17
 * 2.4
 */
//class IsFloat {
//    public static float isFloat(String input) {
//// Введите свое решение ниже
//        Float num = 0f;
//        try {
//            num = Float.parseFloat(input);
//            return num;
//        } catch (NumberFormatException e) {
//            System.out.println("Your input is not a float number. Please, try again.");
//            return Float.NaN;
//        }
//
//    }
//}

/**
 * Напишите программу, которая вычисляет значение выражения intArray[8] / d, гдеintArray- массив целых чисел, а d - делитель.
 * Программа проверяет, имеется ли в массиве intArray элемент с индексом 8, и если нет, выводит сообщение о невозможности выполнения операции.
 * Также программа проверяет, равен ли делитель d нулю, и если да, выводит соответствующее сообщение.
 *
 * На входе:
 * '1 2 3 4 5 6 7 8 9'
 * '1'
 * На выходе:
 * intArray[8] / d = 9 / 1 = 9.0
 * 9.0
 * После запуска программы, если не переданы аргументы командной строки, то intArray будет {0, 1, 2, 3, 4, 5, 6, 7, 8, 9} и d будет равно 0. В этом случае результат выражения intArray[8] / d будет бесконечность (так как деление на 0).
 * Таким образом, программа выведет сообщение:
 *
 * It's not possible to evaluate the expression - intArray[8] / d as d = 0.
 * NaN
 *
 *Программа должна выдавать следующие ошибки:
 *
 * Если длина массива меньше 9:
 * It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.
 *
 * В этом случае, если массив имеет меньше 9 элементов, программа сообщает, что не удается вычислить выражение, так как в массиве нет 8-го элемента.
 *
 * Если d равно 0:
 * It's not possible to evaluate the expression - intArray[8] / d as d = 0.
 *
 * Если d равно 0, программа сообщает, что не удается вычислить выражение, так как деление на 0 невозможно.
 */
//class Expr {
//
//    public static double expr(int[] intArray, int d) {
//        try {
//            if (d!=0) System.out.println("intArray[8] / d = " + intArray[8] + " / " + d + " = " + (double) intArray[8] / d);
//            return intArray[8] / d;
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
//            return Double.NaN;
//        } catch (ArithmeticException e) {
//            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
//            return Double.NaN;
//        }
//
//    }
//}

/**
 * Напишите программу для выполнения арифметической операции деления двух целых чисел a и b.
 * При этом программа должна проверить, что делитель b не равен нулю, и выполнить деление только в этом случае.
 * Если b равен нулю, программа должна вернуть результат равный нулю.
 * После выполнения операции деления, программа также должна вывести сумму чисел a и b с помощью метода printSum.
 * Если аргументы не переданы через командную строку, используйте значения по умолчанию.
 *
 * На входе:
 * '12'
 * '5'
 * На выходе:
 * 17
 * 2.4
 */

//class Expr {
//
//    public static double expr(int a, int b) {
//        try {
//            printSum(a, b);
//            if (b==0) return a /b;
//            return (double) a /b;
//        } catch (ArithmeticException e) {
////            System.out.println("It's not possible to evaluate the expression - a / b as b = 0.");
//            return 0;
//        }
//
//    }
//
//    public static void printSum(int a, int b) {
//        System.out.println(a+b);
//
//    }
//}

/**
 * Напишите программу, которая принимает символ a в качестве аргумента и выполняет следующую проверку:
 * если символ a равен пробелу '', программа должна выбрасывать исключение с сообщением
 * "Пустая строка введена.".
 * В противном случае программа должна возвращать сообщение
 * "Ваш ввод - [символ]", где [символ] заменяется на введенный символ a.
 *
 * На входе:
 * '0'
 * На выходе:
 * Result: Your input was - 0
 */

class Expr {
    public static String expr(char a) throws Exception {
        if (a == ' ') throw new Exception("Empty string has been input.");
        return "Your input was - " + a;

//        try {
//
//            return String.valueOf(Integer.parseInt(String.valueOf(a)));
//        } catch (NumberFormatException e) {
//            e.setStackTrace();
////            return "Empty string has been input.";


    }
}

