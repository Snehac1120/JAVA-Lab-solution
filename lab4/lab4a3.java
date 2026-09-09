import java.util.Scanner;
public class lab4a3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n1,n2,n3");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        lab4a3 ie=new lab4a3();
        ie.largest(a,b,c);
        sc.close();
    }
     void largest(int a,int b,int c){
               System.out.println("max="+((a>b)&&(a>c)?a:((b>c)?b:c)));
}
}