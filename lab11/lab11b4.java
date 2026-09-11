import java.util.Scanner;

interface Car{
    void moveForward();
    void moveBackward();
    void moveLeft();
    void moveRight();
    void applyBreak();
}

class Swift implements Car{

    public void moveForward(){
        System.out.println("swift moves forward");
    }

    public void moveBackward(){
        System.out.println("Swift moves backward");
    }

    public void moveLeft(){
        System.out.println("Swift moves left");
    }

    public void moveRight(){
        System.out.println("Swift moves right");
    }

    public void applyBreak(){
        System.out.println("Swift applies break");
    }

}

class Thar implements Car{
   public void moveForward(){
        System.out.println("Thar moves forward");
    }

    public void moveBackward(){
        System.out.println("Thar moves backward");
    }

    public void moveLeft(){
        System.out.println("Thar moves left");
    }

    public void moveRight(){
        System.out.println("Thar moves right");
    }

    public void applyBreak(){
        System.out.println("Thar applies break");
    }

}


public class lab11b4 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Car z;
    Swift s=new Swift();
    Thar t=new Thar();

    z=s;
    System.out.println("Swift");
    z.moveForward();
    z.moveBackward();
    z.moveLeft();
    z.moveRight();
    z.applyBreak();

    System.out.println();

    z=t;
    System.out.println("Thar");
    z.moveForward();
    z.moveBackward();
    z.moveLeft();
    z.moveRight();
    z.applyBreak();

    sc.close();
   }
}
