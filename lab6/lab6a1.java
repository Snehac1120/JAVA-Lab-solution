import java.util.Scanner;

class student{
    int roll_no;
    String Name;
    double SPI;
    String course;
    void setter(int n,String na,double s,String c){
        roll_no=n;
        Name=na;
        SPI=s;
        course=c;
    }
    void getter(){
        System.out.println(roll_no+":"+Name+":"+SPI+":"+course);
    }
}
public class lab6a1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    student s1=new student();
    student s2=new student();
    student s3=new student();
    System.out.println("enter roll no,name,spi and course for s1");
    s1.setter(sc.nextInt(),sc.next() ,sc.nextDouble(),sc.next());
    s1.getter();
    System.out.println("enter roll no,name,spi and course for s2");
    s2.setter(sc.nextInt(),sc.next() ,sc.nextDouble(),sc.next());
    s2.getter();
    System.out.println("enter roll no,name,spi and course for s3");
    s3.setter(sc.nextInt(),sc.next() ,sc.nextDouble(),sc.next());
    s3.getter();
    sc.close();
    }
}
