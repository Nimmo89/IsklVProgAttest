package gb.ru;

public class User {
    private String name;
    private String surname;
    private String patronymic;
    private String dateOfBirth;
    private long phone;
    private char gender;

    public User(String name, String surname, String patronymic, String dateOfBirth, long phone, char gender) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.gender = gender;
    }
    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public long getPhone() {
        return phone;
    }

    public char getGender() {
        return gender;
    }
}
