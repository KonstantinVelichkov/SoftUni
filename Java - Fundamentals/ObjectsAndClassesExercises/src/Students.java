import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] studentInfo = scan.nextLine().split("\\s+");
            Student s1 = new Student(studentInfo[0], studentInfo[1], Double.parseDouble(studentInfo[2]));
            studentList.add(s1);

        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }

    private static class Student {
        String firstName;
        String lastName;
        double grade;

        private Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        private String getFirstName() {
            return firstName;
        }

        private String getLastName() {
            return lastName;
        }

        private double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return (String.format("%s %s: %.2f",this.firstName,this.lastName,this.grade));
        }
    }

}
