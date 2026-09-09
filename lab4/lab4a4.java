import java.util.Scanner;
public class lab4a4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        lab4a4 ie=new lab4a4();
        ie.primeor_not(n);
        sc.close();

    }
    void primeor_not(int n){
        boolean prime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        if(prime){
            System.out.println(n+" is prime");
        }
        else{
            System.out.println(n+" is not prime");
        }
}
}
