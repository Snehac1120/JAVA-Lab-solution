import java.util.Scanner;
class time{
    int hour,min,sec;

    void setter(int hour,int min,int sec){
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }

    void add(time t1,time t2,time t3){
        sec=t1.sec+t2.sec+t3.sec;
        min=t1.min+t2.min+t3.min;
        hour=t1.hour+t2.hour+t3.hour;

        if(sec>=60){
            min=min+(sec/60);
            sec=sec%60;
        }

        if(min>=60){
            hour=hour+(min/60);
            min=min%60;
        }
    }


    void print(){
        System.out.println("Ans="+hour+":"+min+":"+sec);
    }
}
public class lab8a1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    time t1=new time();
    time t2=new time();
    time t3=new time();
    time t4=new time();

    System.out.println("enter time for t1 in hr,min,sec");
    t1.setter(sc.nextInt(),sc.nextInt(),sc.nextInt());

    System.out.println("enter time for t2 in hr,min,sec");
    t2.setter(sc.nextInt(),sc.nextInt(),sc.nextInt());

    System.out.println("enter time for t3 in hr,min,sec");
    t3.setter(sc.nextInt(),sc.nextInt(),sc.nextInt());

    t4.add(t1, t2,t3);
    t4.print();

    sc.close();
    }
}