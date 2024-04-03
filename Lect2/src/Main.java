import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /** Примеры исключений класса RuntimeException - исключения этого класса не фиксируются Джавой на этапе компиляции
         * - с ними можно запустить программу */

//        String name = null;
//        System.out.println(name.length());
        /** Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "name" is null
        at Main.main(Main.java:5)  //Обращение к несуществующему объекту */

//        Object object = new String("123");
//        File file = (File) object;
//        System.out.println(file);
        /** Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.io.File (java.lang.String and java.io.File are in module java.base of loader 'bootstrap')
         at Main.main(Main.java:11)  //Неверное приведение типов */

//        String number = "123fq";
//        int res = Integer.parseInt(number);
//        System.out.println(res);
        /** Exception in thread "main" java.lang.NumberFormatException: For input string: "123fq"  //Неверное преобразование
         символьной строки в числовой формат */

//        List<Object> emptyList = Collections.emptyList();
//        emptyList.add(new Object());
        /** Exception in thread "main" java.lang.UnsupportedOperationException  //Попытка выполнения нереализованного
         метода */

        /* ЕСТЬ 2 МЕТОДА ОБРАБОТКИ ИСКЛЮЧЕНИЙ:
        1. Поместить код, бросающий исключение, в блок try-catch
        2. Пробросить с помощью throws исключение методу на уровень выше,
        то есть методу, вызывающему текущий.
         */

         /*  МЕТОД try-catch:
        ● try — попытка выполнить код, в котором потенциально может возникнуть исключение
        ● catch — перехват исключения указанного типа (или его наследника) с целью обработать
        возникшую ошибочную ситуацию
         */
        int number = 777;
        try {  // Если в блоке нет ошибки - код в нём выполнится
            number = 10/0;
//        } catch (ArithmeticException e){  // Блок будет перехватывать только ArithmeticException
        } catch (Exception e){  // Блок будет перехватывать все Exception
            System.out.println("Делить на ноль - не хорошо");
        }
        System.out.println(number); // Делить на ноль - не хорошо
//        777 // Сообщение о исключении и завершение программы - вывели 777

        int number1 = 555;
        try {
            number = 10/1;
            String test = null;
            System.out.println(test.length()); // применять метод .length() к нулевой строке - нельзя
        } catch (ArithmeticException e){  // Блок будет перехватывать ArithmeticException
            System.out.println("Делить на ноль - не хорошо");
        } catch (NullPointerException e){ // Блок будет перехватывать NullPointerException
            System.out.println("Обращение к несуществующему объекту");
        }
        System.out.println(number);  // Обращение к несуществующему объекту
//        10

        try {
            FileReader test = new FileReader("test.txt");
        } catch (FileNotFoundException e) {
            // Джава требует обработки исключений для FileReader на случай если файл test.txt не будет найден
            throw new RuntimeException(e);
        }

       /*  МЕТОД try-catch:
        ● finally исполняется всегда и не зависит от наличия или отсутствия исключений
        Туда помещаем код, который в любом случае должен быть исполнен -
        например закрытие файла после файлридера
         */

        FileReader test1 = null;
        try {
            test1 = new FileReader("test1.txt");
            test1.read();
        } catch (RuntimeException | IOException e) {
            // Если хотим обработать исключения не имеющие одного родителя -
            // можно перечислять типы исключений в одном блоке catch.
            System.out.println("Произошло исключение:"+ e.getClass().getSimpleName()); // Выведет класс и название исключения
        } finally {  // Блок кода finally исполняется всегда и не зависит от наличия исключений
            if (test1 != null ) {
                try {
                    test1.close();
                } catch (IOException e) {
//                    throw new RuntimeException(e);
                    System.out.println("Возникло исключение при закрытии файла");
                }
            }

        }


    }
}