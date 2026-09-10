import java.util.Scanner;
class area{
    static final double PI=3.14159;
    double r;

    void setter(double r){
        this.r=r;
    }

    static double cal(double r){
        return PI*r*r;
    }
}
public class lab8b4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        area c1=new area();

        System.out.println("enter r for c1=");
        c1.setter(sc.nextDouble());
        double res=area.cal(c1.r);

        System.out.println("area of circle="+res);
        sc.close();
    }
}
