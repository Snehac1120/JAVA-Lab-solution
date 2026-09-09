import java.util.Scanner;
public class lab3c5ii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n1,n2,n3");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("max among 3 no.");
        if(a>b && a>c){
            System.out.println("a="+a);
        }
        else if(b>c && b>a){
        System.out.println("b="+b);
        }

        else{
            System.out.println("c="+c);
        }
        sc.close();
    }
}