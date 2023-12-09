package gb.ru;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InputParser {
    public static User parseInput(String inputData) {
        String[] inputArray = inputData.split(" ");
        // Проверяем количество введенных данных
        if (inputArray.length != 6) {
            throw new IllegalArgumentException("Неверное количество введеных данных.");
        }
        // Парсим и проверяем форматы данных
        String surname = inputArray[0];
        String name = inputArray[1];
        String patronymic = inputArray[2];
        String dateOfBirth = inputArray[3];
        long phoneNumber;
        char gender;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        try {
            Date parsedDate = dateFormat.parse(dateOfBirth);
            // Проверяем, что введенная дата соответствует ожидаемому формату
            if (!dateOfBirth.equals(dateFormat.format(parsedDate))) {
                throw new IllegalArgumentException("Неверный формат даты рождения(День, Месяц, Год).");
            }
        } catch (ParseException e) {
            throw new IllegalArgumentException("Неверный формат даты рождения.");
        }

        try {
            phoneNumber = Long.parseLong(inputArray[4]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Неверный формат номера телефона(только цифры).");
        }
        // Проверяем, что введенный пол соответствует ожидаемому формату
        if (inputArray[5].length() != 1 || (!inputArray[5].equals("ж") && !inputArray[5].equals("м") && !inputArray[5].equals("f") && !inputArray[5].equals("m"))) {
            throw new IllegalArgumentException("Неверный формат пола(ж или м или f или m).");
        }
        gender = inputArray[5].charAt(0);

        return new User(surname, name, patronymic, dateOfBirth, phoneNumber, gender);
    }
}
