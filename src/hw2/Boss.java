package hw2;

import java.util.List;

public class Boss extends Employee {
    public Boss(String FIO, String post, String telephone, int salary, int age) {
        super(FIO, post, telephone, salary, age);
    }

    public static void salaryUp(List<Employee> employees) {
        for (Employee e :
                employees) {
            if (!e.getPost().equals("boss")) {
                if (e.getAge() >= 45) e.setSalary(e.getSalary() + 5000);
            }
        }
    }
}
