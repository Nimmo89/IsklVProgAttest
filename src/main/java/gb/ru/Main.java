package gb.ru;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Просим пользователя ввести данные
        System.out.println("Введите данные (разделенные пробелом(фимилия, имя, отчество, дата_рождения, номер_телефона, пол)):");
        String inputData = scanner.nextLine();
        // Парсим введенные данные
        User parsedData = InputParser.parseInput(inputData);
        // Записываем данные в файл
        DataWriter.writeToFile(parsedData);
    }
}