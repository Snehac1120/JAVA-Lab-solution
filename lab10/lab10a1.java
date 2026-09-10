import java.util.Scanner;
abstract class vegetable {
    String color;
    void dispName(String color){
        this.color=color;
        System.out.println("color:"+color);
    } 
    abstract public String toString();
}
class potato extends vegetable{
   
    @Override
    public String toString(){

        return("veg name=Potato");
    }
}
class brinjal extends vegetable{
   
     @Override
    public String toString(){
        return("veg name=brinjal");

    }
}
class tomato extends vegetable{
   
     @Override
    public String toString(){
        return("veg name=tomato");
    }
}
public class lab10a1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        vegetable v1=new potato();
        vegetable v2=new brinjal();
        vegetable v3=new tomato();


    System.out.println(v1);
    v1.dispName("yellow");
    System.out.println(v2);
    v2.dispName("violet");
    System.out.println(v3);
    v3.dispName("red");
    sc.close();
    }
}
