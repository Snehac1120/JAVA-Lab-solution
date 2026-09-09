import java.util.Scanner;
public class lab3a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a operation");
        char ch=sc.next().charAt(0);
        System.out.println("enter n1 & n2");
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch(ch){
            case '+':
                System.out.println("a+b="+(a+b));
                break;
            case '-':
                System.out.println("a-b="+(a-b));
                break;
            case '*':
                System.out.println("a*b="+(a*b));
                break;
            case '/':
                System.out.println("a/b="+(a/b));
                break;
                case '%':
                System.out.println("a%b="+(a%b));
                break;
        }
        sc.close();
    }
}
