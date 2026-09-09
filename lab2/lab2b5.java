import java.util.Scanner;
public class lab2b5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. in m:");
        int i=sc.nextInt();
        System.out.println("meter to feet="+(i*3.28));
        sc.close();
    }
}
