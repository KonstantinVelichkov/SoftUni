import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**Create new list, with type Students the class I've created.*/
        List<Student> students = new ArrayList<>();

        String line = scan.nextLine();
        while (!line.equals("end")) {
            /**Ive created a method that parses the input*/
            Student s = Student.parseStudent(line);

            /*String[] studentParameters = line.split(" ");
            //Create new instance ot Student
            Student s = new Student(studentParameters[0],
                    studentParameters[1],
                    Integer.parseInt(studentParameters[2]),
                    studentParameters[3]);*/
            /**checks if the student exists in the list*/
            int existingIndex = findStudentIndex(students, s.getFirstName(), s.getLastName());
            if (existingIndex != -1) {
                students.get(existingIndex).setHomeTown(s.homeTown);
                students.get(existingIndex).setAge(s.age);
            } else {
                /**add the studentParameters values to the list*/
                students.add(s);
            }


            line = scan.nextLine();
        }

        /**Searching a student by hometown*/
        String townName = scan.nextLine();

        for (Student student : students) {
            if (student.getHomeTown().equals(townName)) {
                /**I've created a method in the class Student which  sets the string format of the output so that,
                 when we print student it will convert it toString and format it to the way we've set it.*/
                System.out.print(student);
            }

            /*System.out.print(String.format("%s %s is %d years old and lives in %s%n",
                    student.getFirstName(),
                    student.getLastName(),
                    student.getAge(),
                    student.getHomeTown());*/


        }

    }

    static int findStudentIndex(List<Student> students, String firstName, String lastName) {
        /**checks if the student exists in the list*/
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFirstName().equals(firstName)
                    && students.get(i).getLastName().equals(lastName)) ;
            {
                return i;
            }

        }
        return -1;
    }


    static class Student {
        String firstName;
        String lastName;
        int age;
        String homeTown;

        /**
         * constructor
         */
        private Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }


        /**
         * Getter
         */
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getHomeTown() {
            return homeTown;
        }


        /**
         * Setter
         */
        public void setAge(int age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

        @Override
        public String toString() {
            return String.format("%s %s is %d years old and lives in %s%n",
                    this.getFirstName(),
                    this.getLastName(),
                    this.getAge(),
                    this.getHomeTown());
        }

        public static Student parseStudent(String string) {
            String[] studentParameters = string.split(" ");
            return new Student(studentParameters[0],
                    studentParameters[1],
                    Integer.parseInt(studentParameters[2]),
                    studentParameters[3]);

        }
    }
}
