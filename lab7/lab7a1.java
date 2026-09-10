import java.util.Scanner;
class circle{
    double radius;
    void setter(double radius){
        this.radius=radius;
    }
    void getter(){
        System.out.println("area of circle="+(Math.PI*radius*radius));
    }
}
public class lab7a1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    circle c1=new circle();
    System.out.println("enter radius of c1");
    c1.setter(sc.nextDouble());
    c1.getter();
    sc.close();
    }
}
