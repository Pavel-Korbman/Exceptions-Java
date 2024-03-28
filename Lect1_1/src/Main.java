import java.io.File;

/**
 * Исключения в программировании и их обработка
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println(getFilesSize(new File("123" )));
//        System.out.println(divides(10,2));
//        divides0();
//        arr();
//        a();
        System.out.println(divides1(10,0));

    }

    /*
    Первый подход — это использование КОДОВ ОШИБОК.
     Минусы:
     1. Зачастую код ошибки невозможно отличить от того результата, который действительно может вернуть метод.
     2. Разработчик, использующий метод, может забыть, что метод возвращает какой-то список кодов ошибок,
     и что на них надо реагировать.
     3. Есть некоторые ошибки, которые обязательно надо обрабатывать.
     4. При возникновении ошибки мы видим только код,
     но у нас нет никакой служебной информации, почему это ошибка возникла.
     */


    // Функция, возвращающая размер файла
    public static long getFilesSize(File file) {
        if (!file.exists()) {
            return -1;
        } // Если файл не существует - возвращаем -1 (наш код ошибки)
        return file.length();
    }

    // Функция деления (на 0)
    public static int divides(int a1, int a2) {
        if (a2 == 0) {
            return -1;
        }
        return a1 / a2;
    }

    /*
    Второй подход — ИСКЛЮЧЕНИЯ.
    Исключения— это специальный тип объектов,
    которые создаются при возникновении ошибочной ситуации
    и выбрасываются Java-машиной.
    1. ИСКЛЮЧЕНИЯ JAVA МАШИНЫ
     */
    public static int divides0() {
        return 10 / 0;
    }
    // Exception in thread "main" java.lang.ArithmeticException: / by zero
    //	at Main.divides0(Main.java:45)
    //	at Main.main(Main.java:10)
    /*
    ● ошибка возникла в потоке main;
    ● было брошено исключение, имеющее тип java.lang.ArithmeticException,
    который указывает на ошибку при выполнении арифметической операции;
    ● есть уточняющее сообщение, о делении на 0,
    и далее прописано имя класса и метода, а также строка, где возникла эта ошибка.
     */

//    public static void arr() {
//        int[] ints = new int[10];
//        System.out.println(ints[100]);
//    }
    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 10
    //	at Main.arr(Main.java:60)
    //	at Main.main(Main.java:11)
    /*
    Index 100 out of bounds for length 10 - обращение к элементу, находящемуся за границами массива
     */

    /**
     * Стек-трейс (stack trace) - это список вызовов методов,
     * которые привели к возникновению исключения (exception).
     * С помощью стек-трейса можно определить, в какой части программы произошла ошибка,
     * и узнать, как программа пришла к этому месту.
     */


    public static void a() {
        b();
    }
    public static void b() {
        c();
    }
    public static void c() {
        int[] ints = new int[10];
        System.out.println(ints[100]);
    }
//    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 10
//	at Main.c(Main.java:93)
//	at Main.b(Main.java:89)
//	at Main.a(Main.java:86)
//	at Main.main(Main.java:12)

/**
 * Верхняя строка at Main.c(Main.java:93) - это строка где произошла ошибка
 * Далее - stack trace - цепочку вызовов, которые к ней вели от момента запуска
 */

 /*
    Второй подход — ИСКЛЮЧЕНИЯ.

    2. СОБСТВЕННЫЕ (сгенерированные) ИСКЛЮЧЕНИЯ
     */
public static int divides1(int a1, int a2) {
    if (a2 == 0) {
        throw new RuntimeException("Деление на 0 - это не хорошо"); // throw - вернуть исключение,
        // RuntimeException() - класс Java для уведомления об исключениях
    }
    return a1 / a2;
}
//    Exception in thread "main" java.lang.RuntimeException: Деление на 0 - это не хорошо
//    - здесь тип ошибки ны сами создали и первой идёт строка, не где возникла ошибка, а где создано исключение
//	at Main.divides1(Main.java:113)
//	at Main.main(Main.java:13)


}