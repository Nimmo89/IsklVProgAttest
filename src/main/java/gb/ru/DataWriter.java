package gb.ru;

import java.io.*;

public class DataWriter {
    public static void writeToFile(User parsedData) {
        String fileName = parsedData.getSurname() + ".txt";
        File file = new File(fileName);
        if (file.exists()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                writer.newLine();
                writer.write("<" + parsedData.getSurname() + ">");
                writer.write("<" + parsedData.getName() + ">");
                writer.write("<" + parsedData.getPatronymic() + ">");
                writer.write("<" + parsedData.getDateOfBirth() + ">");
                writer.write("<" + parsedData.getPhone() + ">");
                writer.write("<" + parsedData.getGender() + ">");
                writer.close();
                System.out.println("Данные успешно записаны в файл.");
            } catch (IOException e) {
                System.out.println("Ошибка записи в файл: " + e.getMessage());
            }
        } else {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                writer.write("<" + parsedData.getSurname() + ">");
                writer.write("<" + parsedData.getName() + ">");
                writer.write("<" + parsedData.getPatronymic() + ">");
                writer.write("<" + parsedData.getDateOfBirth() + ">");
                writer.write("<" + parsedData.getPhone() + ">");
                writer.write("<" + parsedData.getGender() + ">");
                writer.close();
                System.out.println("Данные успешно записаны в файл.");
            } catch (IOException e) {
                System.out.println("Ошибка записи в файл: " + e.getMessage());
            }
        }
/*        try (FileOutputStream fos = new FileOutputStream(fileName, true)) {
            String data = "<" + parsedData.getSurname() + "><" + parsedData.getName() + "><" + parsedData.getPatronymic() + "><" + parsedData.getDateOfBirth() + ">
            <" + parsedData.getPhone() + "><" + parsedData.getGender() + ">" + "\n";
            fos.write(data.getBytes());
            System.out.println("Данные успешно записаны в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }*/
        /*try {
            String data = "<" + parsedData.getSurname() + "><" + parsedData.getName() + "><" + parsedData.getPatronymic() + "><" + parsedData.getDateOfBirth() + ">" +
                    "<" + parsedData.getPhone() + "><" + parsedData.getGender() + ">" + "\n";
            Files.write(Paths.get(fileName), data.getBytes(), StandardOpenOption.APPEND);
            System.out.println("Данные успешно записаны в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }*/
    }
}