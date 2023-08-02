package hw2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ivan Ivanovich", "boss", "891100099922", 100, 60));
        employees.add(new Employee("Kate Belozerts", "doctor", "89110077777", 2000000, 27));
        employees.add(new Employee("Roma Kostin", "actor", "891666666622", 130000, 49));
        employees.add(new Employee("Andrey Sanin", "sailor", "4567887422", 160000, 39));
        employees.add(new Employee("Kolyan Naumov", "policeman", "89115449922", 170000, 45));

        System.out.println(employees);
//        Employee.salaryUp(employees);   // поднимает зп всем, кто старше 45
        Boss.salaryUp(employees);  // не поднимает зп руководитлям
        System.out.println(employees);
    }
}
