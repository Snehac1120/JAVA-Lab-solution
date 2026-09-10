import java.util.Scanner;
class bankacc{
    double bal;
    int accno;

     static double intrate=7;
     static String bankname="ICICI";

    void setter(double bal,int accno){
        this.bal=bal;
        this.accno=accno;
    }



    void getter(){
        System.out.println("int acc no="+accno+",bal="+bal+",bank name="+bankname+",int rate="+intrate);
    }
}
public class lab8a3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        bankacc p1=new bankacc();
        bankacc p2=new bankacc();
        bankacc p3=new bankacc();

        System.out.println("entre bal and acc no for p1=");
        p1.setter(sc.nextDouble(), sc.nextInt());
        p1.getter();

        System.out.println("entre bal and acc no for p2=");
        p2.setter(sc.nextDouble(), sc.nextInt());
        p2.getter();


        System.out.println("entre bal and acc no for p3=");
        p3.setter(sc.nextDouble(), sc.nextInt());
        p3.getter();


        sc.close();
    }
}
