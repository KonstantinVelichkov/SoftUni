import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
    private static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        List<Person> sorted = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] personalInfo = scan.nextLine().split("\\s+");
            String name=personalInfo[0];
            int age=Integer.parseInt(personalInfo[1]);
            Person person1 = new Person(name, age);
            List<Person> personList = new ArrayList<>();
            personList.add(person1);
            int ageLimit = 30;

            if (personList.get(i).getAge() > ageLimit) {
                sorted.add(person1);
            }

        }
        sorted.sort(Comparator.comparing(Person::getName));
        for (int i = 0; i < sorted.size(); i++) {
            System.out.println("" + sorted.get(i).getName() +" - "+ sorted.get(i).getAge());
        }

    }

    private static class Person {
        String name;
        int age;

        private Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        private int getAge() {
            return age;
        }

        private String getName() {
            return name;
        }
    }
}
