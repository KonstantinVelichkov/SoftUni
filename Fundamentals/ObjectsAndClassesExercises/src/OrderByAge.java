import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        String command = input[0];
        List<PersonDetails> peopleList = new ArrayList<>();
        while (!command.equals("End")) {
            String name = input[0];
            String id = input[1];
            int age = Integer.parseInt(input[2]);
            PersonDetails newPerson = new PersonDetails(name, id, age);
            peopleList.add(newPerson);
            input = scan.nextLine().split("\\s+");
            command = input[0];
        }
        peopleList.sort(Comparator.comparing(PersonDetails::getAge));
        for (int i = 0; i < peopleList.size(); i++) {
            System.out.println(peopleList.get(i).toString());
        }
    }

    private static class PersonDetails {
        String name;
        String id;
        int age;

        private PersonDetails(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }
        private int getAge(){
            return age;
        }
        @Override
        public String toString(){
            return String.format("%s with ID: %s is %d years old.",
                    name,id, age);
        }
    }
}
