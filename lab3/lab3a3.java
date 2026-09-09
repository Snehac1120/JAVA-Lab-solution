import java.util.Scanner;
public class lab3a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n1 & n2");
        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Area of rectangle:");
        System.out.println("length*breadth="+(l*b));
        sc.close();
    }
}
