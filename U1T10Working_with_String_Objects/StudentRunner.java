package U1T10Working_with_String_Objects;
public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student("Abby", "Smith", 2023);
        student.addTestScore(95);
        student.addTestScore(98);
        System.out.println(student.getStudentInfo());

    }
}
