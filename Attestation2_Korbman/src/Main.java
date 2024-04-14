
public class Main {
    public static void main(String[] args) {

        System.out.println(inputData.inputData("input.txt"));
        System.out.println("Всего продуктов: " +inputData.inputData("input.txt").size());
        System.out.println("Самое длинное название продукта: " + longWord.longWord(inputData.inputData("input.txt")));
    }
}