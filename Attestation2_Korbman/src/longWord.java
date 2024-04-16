import java.util.ArrayList;
import java.util.Comparator;

public class longWord {
    public static String longWord(ArrayList<String> arrayList) {
        arrayList.sort(Comparator.comparingInt(String::length));
        return arrayList.getLast();
    }
}
