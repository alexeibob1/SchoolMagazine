import java.util.ArrayList;

public class Magazine {
    private ArrayList<Student> studentsList;

    Magazine() {
        studentsList = new ArrayList<>();
    }

    public Student getStudent(int i) {
        return studentsList.get(i);
    }
}
