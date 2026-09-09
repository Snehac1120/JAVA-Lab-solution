import java.util.Scanner;
public class lab3c5i {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n1,n2,n3");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("max="+((a>b)&&(a>c)?a:((b>c)?b:c)));
        sc.close();
    }
}