
import java.util.Scanner;

abstract class bankAcc {
    double balance;

    bankAcc(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amt);
    abstract void withdraw(double amt);
}

class savingAcc extends bankAcc {

    savingAcc(double balance) {
        super(balance);
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Amt deposited, New bal = " + balance);
    }

    void withdraw(double amt) {
        balance -= amt;
        System.out.println("Amt withdraw, New bal = " + balance);
    }
}

class CurrentAcc extends bankAcc {

    CurrentAcc(double balance) {
        super(balance);
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Amt deposited, New bal = " + balance);
    }

    void withdraw(double amt) {
        balance -= amt;
        System.out.println("Amt withdraw, New bal = " + balance);
    }
}

public class lab10a2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter balance:");
        double balance = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter type of Acc (savingacc/currentacc):");
        String type = sc.nextLine();

        if (type.equalsIgnoreCase("savingacc")) {

            savingAcc s = new savingAcc(balance);

            System.out.println("Withdraw or Deposit?");
            String choose = sc.nextLine();

            if (choose.equalsIgnoreCase("withdraw")) {
                System.out.println("Amt to withdraw:");
                s.withdraw(sc.nextDouble());
            } 
            else if (choose.equalsIgnoreCase("deposit")) {
                System.out.println("Amt to deposit:");
                s.deposit(sc.nextDouble());
            }

        } 
        else if (type.equalsIgnoreCase("currentacc")) {

            CurrentAcc c = new CurrentAcc(balance);

            System.out.println("Withdraw or Deposit?");
            String choose = sc.nextLine();

            if (choose.equalsIgnoreCase("withdraw")) {
                System.out.println("Amt to withdraw:");
                c.withdraw(sc.nextDouble());
            } 
            else if (choose.equalsIgnoreCase("deposit")) {
                System.out.println("Amt to deposit:");
                c.deposit(sc.nextDouble());
            }

        } 
        else {
            System.out.println("Wrong type");
        }

        sc.close();
    }
}