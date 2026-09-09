import java.util.Scanner;
public class lab4a7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter range r1 & r2");
        int r1=sc.nextInt();
        int r2=sc.nextInt();
        lab4a7 ie=new lab4a7();
        for(int i=r1;i<=r2;i++)
        ie.rangeofprime(i);

        sc.close();

    }
    void rangeofprime(int n){
        boolean prime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        if(prime){
            System.out.print(n+",");
        }
}
}
