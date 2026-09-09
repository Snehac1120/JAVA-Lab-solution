import java.util.Scanner;

class Employee{
    String name;
    String job_title;
    double salary;
    void setter(String n,String jt,double s){
        name=n;
        job_title=jt;
        salary=s;
    }
    void getter(){
        System.out.println("name="+name+",job title="+job_title+",salary="+salary);    }

    void calculate(double bonus){
        System.out.println("updated salary="+(salary+bonus));
    }

    void updatesalary(double newsalary,double bonus){
        salary=newsalary;
        System.out.println("new salary="+(newsalary+bonus));
    }
}


public class lab6b5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double bonus;
        
        Employee e1=new Employee();
        System.out.println("enter name,job title, salary of e1");
        e1.setter(sc.next(),sc.next(), sc.nextDouble());
        e1.getter();
        System.out.println("enter bonus");
        bonus=sc.nextDouble();
        e1.calculate(bonus);
        System.out.println("enter new salary ");
        e1.updatesalary(sc.nextDouble(),bonus);


        Employee e2=new Employee();
        System.out.println("enter name,job title, salary of e2");
        e2.setter(sc.next(),sc.next(), sc.nextDouble());
        e2.getter();
        System.out.println("enter bonus");
        bonus=sc.nextDouble();
        e2.calculate(bonus);
        System.out.println("enter new salary ");
        e2.updatesalary(sc.nextDouble(),bonus);
        sc.close();
    }
}
