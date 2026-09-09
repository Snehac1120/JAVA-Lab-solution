import java.util.Scanner;
public class lab2c6 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a char");
        char ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("charcter is vowel");
        }
        else{
            System.out.println("character is consonant");
        }
        sc.close();
}
}
