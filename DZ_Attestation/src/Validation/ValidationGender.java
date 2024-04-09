package Validation;

import java.util.List;
import java.util.zip.DataFormatException;

public class ValidationGender {
    public ValidationGender(List<String> data) throws DataFormatException {
        if (data.get(5).equalsIgnoreCase("м") | data.get(5).equalsIgnoreCase("ж")) {
            System.out.println(data.get(5));
        } else throw new DataFormatException("Небинарным личность вход закрыт! Пол только м или ж .");
    }
}
