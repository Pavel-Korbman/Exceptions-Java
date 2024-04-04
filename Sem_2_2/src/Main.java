import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Задание №3
 * 📔 Запишите в файл следующие строки:
 * Анна=4
 * Елена=5
 * Марина=6
 * Владимир=?
 * Константин=?
 * Иван=4
 * Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap, если
 * студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено
 * значение ?, заменить его на соответствующее число.Если на каком-то месте встречается символ, отличный от
 * числа или ?, бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br  = new BufferedReader(new FileReader("names.txt"));
            List<String> list = new ArrayList<>();
            String content = br.readLine();
            while (content != null ){
                list.add(content);
                content = br.readLine();
            }
            br.close();
            HashMap<String, Integer> map = new HashMap<>();
            for (String i: list){
                String[] parts = i.split("=");
//                if (parts[1].equals("?")) map.put(parts[0], parts[0].length());
                map.put(parts[0], parts[0].length());
            }
            StringBuilder out = new StringBuilder();
            FileWriter file = new FileWriter("names.txt");
            for (String name: map.keySet()){
                out.append(name).append("=").append(map.get(name)).append("\n");
            }
            file.write(String.valueOf(out));
            file.flush();
            file.close();
        } catch (FileNotFoundException e){
            System.out.println("Такой файл не найден");
        }

    }
}