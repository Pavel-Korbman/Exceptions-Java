import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = inputData.inputData("input.txt");
        System.out.println("Всего продуктов: " +list.size());
        System.out.println("Всего наименований продуктов: " +products.products(list).size());
        System.out.println("Самое длинное название продукта: " + longWord.longWord(list));
        System.out.println("Количество продуктов: ");
        products.products(list).entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);

    }
}