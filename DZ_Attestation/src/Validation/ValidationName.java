package Validation;

import java.util.List;
import java.util.zip.DataFormatException;

public class ValidationName {
    public ValidationName(List<String> data) throws DataFormatException{
        if (data.getFirst().length() >= 2) System.out.println(data.getFirst());
        else throw new DataFormatException("Слишком короткая фамилия !");

        if (data.get(1).length() >= 2) System.out.println(data.get(1));
        else throw new DataFormatException("Слишком короткое имя !");

        if (data.get(2).length() >= 2) System.out.println(data.get(2));
        else throw new DataFormatException("Слишком короткое отчество !");
    }
}
