import java.util.Scanner;
public class lab4a6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        lab4a6 ie=new lab4a6();
        ie.palinor_not(n);
        sc.close();
    }
    void palinor_not(int n){
        int onum=n;
        int num=0;
        int rem=0;
        while(n!=0){
        rem=n%10;
        num=num*10+rem;
        n=n/10;
        }
      //  System.out.println(""+num);
        if(num==onum){
            System.out.println(onum+" is palindrome");
        }
        else{
            System.out.println(onum+" is not palindrome");
        }
    }
}