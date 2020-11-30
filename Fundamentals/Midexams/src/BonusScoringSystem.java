import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int studentCount = Integer.parseInt(scan.nextLine());
        int lecturesCount = Integer.parseInt(scan.nextLine());

        int additionalBonus = Integer.parseInt(scan.nextLine());
        if (lecturesCount == 0) {
            System.out.printf("Max Bonus: 0.%nThe student has attended 0 lectures.");
        } else {

            List<Student> studentList = new ArrayList<>();
            for (int i = 0; i < studentCount; i++) {
                int attendance = Integer.parseInt(scan.nextLine());
                double totalBonus = ((attendance / (double) lecturesCount) * (5 + additionalBonus));
                Student student = new Student(attendance, totalBonus);
                studentList.add(student);
            }
            studentList.sort(Comparator.comparing(Student::getTotalBonus).reversed());
            System.out.printf("Max Bonus: %d.%nThe student has attended %d lectures.",
                    (int) Math.ceil(studentList.get(0).getTotalBonus()),
                    studentList.get(0).getAttendance());
        }
    }

    public static class Student {
        int attendance;
        double totalBonus;

        private Student(int attendance, double totalBonus) {
            this.attendance = attendance;
            this.totalBonus = totalBonus;
        }
        public int getAttendance() {
            return attendance;
        }

        public double getTotalBonus() {
            return totalBonus;
        }
    }
}
