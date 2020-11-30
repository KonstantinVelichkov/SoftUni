import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, List<Double>> students = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String studentName = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());

            students.putIfAbsent(studentName, new ArrayList<>());
            students.get(studentName).add(grade);
        }
        students.entrySet()
                .stream()
                .filter(s -> s.getValue()
                        .stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
                        .getAsDouble() >= 4.50)
                .sorted((f, s) -> {
                    double first = f.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    double second = s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    return Double.compare(second, first);
                })
                .forEach(e ->
                    System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue()
                            .stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble()
                    ));
    }
}


