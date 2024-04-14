import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("nnn");
        arrayList.add("nn");
        arrayList.add("n");
        arrayList.add("nnnn");
        arrayList.add("nn");
        System.out.println(arrayList);
        arrayList.sort(Comparator.comparingInt(String::length));
        System.out.println(arrayList);
        System.out.println(arrayList.getLast());
    }
}