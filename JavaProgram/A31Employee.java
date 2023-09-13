import java.util.Scanner;
class Employee {
    private String name;
    private int age;
    private double salary;

    public void getEmpInfo() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        name = input.nextLine();

        System.out.print("Enter employee age: ");
        age = input.nextInt();

        System.out.print("Enter employee salary: ");
        salary = input.nextDouble();
    }

    public void disEmpInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: " + salary);
    }

    public void raiseSalary(double percent) {
        salary += (salary * percent / 100);
        System.out.println("Salary Raised by " + percent + "%");
    }
}

public class A31Employee {
    public static void main(String[] args) {
        Employee emp = new Employee();

        System.out.println("*** Employee Record System ***");

        emp.getEmpInfo();
        emp.disEmpInfo();

        emp.raiseSalary(10); // increase salary by 10%
        emp.disEmpInfo();
    }
}

