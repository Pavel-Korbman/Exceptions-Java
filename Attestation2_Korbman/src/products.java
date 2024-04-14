import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class products {
    public static HashMap<String, Integer> products(ArrayList<String> arrayList){
        HashMap<String, Integer> res = new HashMap<>();
        for (String el: arrayList) {
            if (!res.containsKey(el)) res.put(el, 1);
            else res.put(el, res.get(el)+1);
        }
        return res;
    }
}
