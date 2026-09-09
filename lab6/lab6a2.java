import java.util.Scanner;

class cube{
    double height;
    double width;
    double depth;
    void setter(double h,double w,double d){
        height=h;
        width=w;
        depth=d;
    }
    void getter(){
        System.out.println("vol ="+(height*depth*width));
    }
}
public class lab6a2 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    cube c1=new cube();
    cube c2=new cube();
    System.out.println("enter height,width and depth for cube 1");
    c1.setter(sc.nextDouble(),sc.nextDouble() , sc.nextDouble());
    c1.getter();
    System.out.println("enter height,width and depth for cube 2");
    c2.setter(sc.nextDouble(),sc.nextDouble() , sc.nextDouble());
    c2.getter();
    sc.close();
   } 
}
