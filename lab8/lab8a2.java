import java.util.Scanner;;
class objc{
    static int c=0;

    objc(){
        c++;
        System.out.println("total no of obj="+c);
    }
}
public class lab8a2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // objc a1=new objc();
        // objc a2=new objc();
        // objc a3=new objc();
        System.out.println(objc.c);
        sc.close();
    }
}
