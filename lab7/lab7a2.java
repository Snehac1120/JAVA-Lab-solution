import java.util.Scanner;
class time{
    double hr;
    double min;
    time(double h,double m){//constructer
        hr=h;
        min=m;
    }
    void getter(){
        double hrangle=hr*30+min*0.5;
        double minangle=min*6;
        double angle=Math.abs(hrangle-minangle);
        double ans=Math.min(360-angle,angle);
        System.out.println("angle btw hr and min hand="+ans);
    }
}
public class lab7a2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter hr & min of t1");
    time t1=new time(sc.nextDouble(),sc.nextDouble());

    //hrangle=hour*30+min*0.5
    //minangle=minangle*6
    //math.abs
    //math.min
    //leetcode=1344
    t1.getter();
    sc.close();
    }
}
