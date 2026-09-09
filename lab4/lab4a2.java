import java.util.Scanner;
public class lab4a2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        lab4a2 ie=new lab4a2();
        ie.even_odd(n);
        sc.close();

    }
    void even_odd(int n){
             if(n%2==0){
            System.out.println(n+" is even");
        }
        else{
            System.out.println(n+" is odd");
        }
    
    }

}