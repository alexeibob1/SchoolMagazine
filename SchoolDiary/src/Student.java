public class Student {
    private String groupCode;
    private int orderNumber;
    private String surname;
    private char name;
    private char patronymic;
    private String birthDate;
    private char gender;

    Student() {}
    
    Student(String groupCode, int orderNumber, String surname, char name, char patronymic, String birthDate, char gender) {
        this.groupCode = groupCode;
        this.orderNumber = orderNumber;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getSurname() {
        return surname;
    }

    public char getName() {
        return name;
    }

    public char getPatronymic() {
        return patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public char getGender() {
        return gender;
    }
}
