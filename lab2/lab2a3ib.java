//scanner class
import java.util.Scanner;
public class lab2a3ib {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence");
        String z=sc.nextLine();
        System.out.println("sentence:"+z);
        System.out.println("enter a no.");
        int a=sc.nextInt();
        System.out.println("a="+a);
        System.out.println("enter float");
        float b=sc.nextFloat();
        System.out.println("b="+b);
        System.out.println("enter doble");
        double c=sc.nextDouble();
        System.out.println("c="+c);
        System.out.println("enter byte");
        byte d=sc.nextByte();
        System.out.println("d="+d);
        System.out.println("enter a char");
        char e=sc.next().charAt(0);
        System.out.println("char:"+e);
        System.out.println("enter a word");
        String f=sc.next();
        System.out.println("word:"+f);
        System.out.println("enter boolean");
        boolean g=sc.nextBoolean();
        System.out.println("boolean:"+g);
        sc.close();
    }
}
