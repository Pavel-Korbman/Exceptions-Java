import java.io.File;
public class Application {
    public static void main(String[] args){
        System.out.println(getFilesSize(new File("123" )));

    }
    // Функция, возвращающая размер файла
    public static long getFilesSize(File file){
        file.length();
    }
}
