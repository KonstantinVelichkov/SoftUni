import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CompanyRooster {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Employees> employeeList = new ArrayList<>();
        Employees.addNewEmployee(n, employeeList, scan);

        Employees.bestDepartmentAndAverageSalary(employeeList);
        System.out.printf("Highest Average Salary: %s%n",Employees.bestDepartmentAndAverageSalary(employeeList));
        for (int i = 0; i<employeeList.size();i++) {
            if(employeeList.get(i).getDepartment().equals(Employees.bestDepartmentAndAverageSalary(employeeList))){
                System.out.println(employeeList.get(i).toString());
            }
        }
    }

    private static class Employees {
        String name;
        double salary;
        String position;
        String department;
        String email;
        int age;

        private Employees(String name, double salary, String position, String department, String email, int age) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = email;
            this.age = age;
        }
        public double getSalary() {
            return salary;
        }

        public String getDepartment() {
            return department;
        }

        public static String bestDepartmentAndAverageSalary(List<Employees> employeeList) {
            String bestDepartment = "";
            double highestAverageSalary = 0;

            List<String> departmentsList = employeeList.stream()
                    .map(Employees::getDepartment)
                    .distinct().collect(Collectors.toList());
            for (String department : departmentsList) {
                double sum = 0.00;
                int count = 0;
                for (Employees employee : employeeList) {
                    if (employee.getDepartment().equals(department)) {
                        sum += employee.getSalary();
                        count++;
                    }
                }
                if (sum / count > highestAverageSalary) {
                    highestAverageSalary = sum / count;
                    bestDepartment = department;
                }
            }
                return bestDepartment;
        }

        public static List<Employees> addNewEmployee(int n, List<Employees> employeeList, Scanner scan) {
            for (int i = 0; i < n; i++) {
                String[] input = scan.nextLine().split("\\s+");
                String name = input[0];
                double salary = Double.parseDouble(input[1]);
                String position = input[2];
                String department = input[3];
                String email = "n/a";
                int age = -1;
                if (input.length == 6) {
                    email = input[4];
                    age = Integer.parseInt(input[5]);
                } else if (input.length == 5) {
                    if (input[4].matches("\\d+")) {
                        age = Integer.parseInt(input[4]);
                    } else {
                        email = input[4];
                    }
                }

                Employees newEmployee = new Employees(name, salary, position, department, email, age);
                employeeList.add(newEmployee);
                employeeList.sort(Comparator.comparing(Employees::getSalary).reversed());
            }
            return employeeList;
        }

        @Override
        public String toString() {
            return String.format("%s %.2f %s %d",
                    this.name, this.salary, this.email, this.age);
        }
    }
}
