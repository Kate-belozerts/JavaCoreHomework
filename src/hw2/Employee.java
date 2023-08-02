package hw2;

import java.util.List;

public class Employee {
    private String FIO;
    private String post;
    private String telephone;
    private int salary;
    private int age;

    public Employee(String FIO, String post, String telephone, int salary, int age) {
        this.FIO = FIO;
        this.post = post.toLowerCase();
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public static void salaryUp(List<Employee> employees){
        for (Employee e :
                employees) {
            if (e.age >= 45) e.salary += 5000;
        }
    }

    public void averageAge(List<Employee> employees){
        int count = 0;
        for (Employee e :
                employees) {
           count += e.age;
        }
        System.out.println("Средний возраст = " + count / employees.size());
    }

    public void averageSalary(List<Employee> employees){
        int count = 0;
        for (Employee e :
                employees) {
            count += e.salary;
        }
        System.out.println("Средняя зарплата = " + count / employees.size());
    }

    public void salaryUp(int age, int salary){
        if (age >= 45) this.salary += salary + 5000;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "FIO='" + FIO + '\'' +
                ", post='" + post + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salary=" + salary +
                ", age=" + age + '\n';
    }

    public String getPost() {
        return post;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
