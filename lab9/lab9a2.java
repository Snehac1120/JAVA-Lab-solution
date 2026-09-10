package JAVA.lab9;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " is working on general tasks.");
    }

    double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {

    HRManager(String name, double salary) {
        super(name, salary);
    }

    void work() {
        System.out.println(name + " is managing HR activities.");
    }

    void addEmployee(String employeeName) {
        System.out.println(name + " added a new employee: " + employeeName);
    }
}

public class lab9a2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 50000);
        emp1.work();
        System.out.println("Salary: " + emp1.getSalary());

        System.out.println();

        HRManager hr1 = new HRManager("Bob", 80000);
        hr1.work();  
        System.out.println("Salary: " + hr1.getSalary());
        hr1.addEmployee("Charlie");  
    }
}