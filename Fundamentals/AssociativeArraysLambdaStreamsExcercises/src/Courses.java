import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();

        Map<String, List<String>> groups = new LinkedHashMap<>();
        while (!command.equals("end")) {
            List<String> input = Arrays.asList(command.split(" : "));
            String courseName = input.get(0).trim();
            String studentName = input.get(1).trim();

            if (groups.get(courseName) == null) {
                groups.put(courseName, new LinkedList<>());
            }
            groups.get(courseName).add(studentName);


            command = scan.nextLine();
        }
        //sort linked hash map by the list size
        groups.entrySet().stream()
                .sorted((f,s)->s.getValue().size() - f.getValue().size())
                .forEach(e->{
                    System.out.println(e.getKey()+": "+e.getValue().size());
                    e.getValue().stream()
                            .sorted((f,s)-> f.compareTo(s))
                            .forEach(s-> System.out.println("-- "+s));
                });
    }
}
