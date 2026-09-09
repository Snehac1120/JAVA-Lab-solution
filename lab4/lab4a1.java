import java.util.Scanner;
public class lab4a1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of 5 subjects:");
        double ms1=sc.nextDouble();
        double ms2=sc.nextDouble();
        double ms3=sc.nextDouble();
        double ms4=sc.nextDouble();
        double ms5=sc.nextDouble();
		double per;
        per=(((ms1+ms2+ms3+ms4+ms5)/500)*100);
        lab4a1 ie=new lab4a1();
        ie.grade(per);
        sc.close();
    }
     void grade(double per){
        if(per<40){
            System.out.println("fail");
        }
        else if(per>=40 && per<=49){
            System.out.println("Third div");
        }
        else if(per>50 && per<=59){
            System.out.println("Second div");
        }
        else if(per>=60){
            System.out.println("First div");
        }
    }       
}
