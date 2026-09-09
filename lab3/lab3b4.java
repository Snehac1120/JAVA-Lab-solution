import java.util.Scanner;
public class lab3b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Temp in Fahrenheit");
        int f=sc.nextInt();
        System.out.println("Fahrenheit to Celsius:");
        System.out.println("(f-32)*5/9="+((f-32)*5/9));
    
        System.out.println("enter Temp in Celcius");
        int c=sc.nextInt();
        System.out.println("Celcius to Farenheit:");
        System.out.println("(c*9/5)+32="+((c*9/5.0)+32));
        sc.close();
    }
}
