// import java.util.Scanner;
// class vehicle{
    
// }
// public class lab10b3 {
//     public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);

//        sc.close();
//     }
// }
// Abstract class Vehicle
abstract class Vehicle {
    // Abstract methods
    abstract void startEngine();
    abstract void stopEngine();
}

// Subclass Car
class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started with a key.");
    }

    @Override
    void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine started with a button.");
    }

    @Override
    void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

// Main class to test the program
public class lab10b3 {
    public static void main(String[] args) {
        // Create objects of Car and Motorcycle
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();

        // Start and stop Car engine
        myCar.startEngine();
        myCar.stopEngine();

        // Start and stop Motorcycle engine
        myMotorcycle.startEngine();
        myMotorcycle.stopEngine();
    }
}