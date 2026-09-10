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

    void showSalary() {
        System.out.println("Salary: " + salary);
    }
}

class HRManager extends Employee {
    String department;
    double salary; 

    HRManager(String name, double parentSalary, String department, double salary) {
        super(name, parentSalary); 
        this.department = department;
        this.salary = salary;
    }

    @Override
    void work() {
        super.work(); 
        System.out.println(name + " is also managing HR tasks in " + department + " department.");
    }

    void showSalaries() {
        System.out.println("HRManager's own salary: " + salary);
        System.out.println("Employee base salary (super): " + super.salary);
    }
}

// Main class
public class lab9a3 {
    public static void main(String[] args) {
        HRManager hr = new HRManager("Alice", 50000, "HR", 80000);

        hr.work();          
        hr.showSalaries();  
    }
}
