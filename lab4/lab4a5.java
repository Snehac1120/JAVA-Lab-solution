import java.util.Scanner;
public class lab4a5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        lab4a5 ie=new lab4a5();
        ie.leapyror_not(n);
        sc.close();

    }
    void leapyror_not(int n){
        boolean leap=true;
            if(n%4==0 && n%100!=0 || n%400==0){
            }
            else{
               leap=false; 
            }
        if(leap){
            System.out.println(n+" is leap yaer");
        }
        else{
            System.out.println(n+" is not a leap year");
        }
}
}

