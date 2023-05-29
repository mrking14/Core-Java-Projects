package ATM_Machine;

import java.util.Scanner;

class ATM {
    static int atmPin = 8581;
    static int balance = 14500;

    public static void checkPin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your ATM Pin: ");
        int pin = sc.nextInt();

        if (atmPin == pin) {
            menu();
        } else {
            System.out.println("You Entered Wrong PIN!");
        }
        sc.close();
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Key! : ");
        System.out.println("1> Check Acount Balance: ");
        System.out.println("2> Deposite Money : ");
        System.out.println("3> Withdraw Money: ");
        System.out.println("4> Exit: ");
        int key = sc.nextInt();

        switch (key) {
            case 1:
                checkAcconutBalance();

                break;
            case 2:
                depositeAmount();

                break;
            case 3:
                withdrawAmmount();

                break;
            case 4:

                break;

            default:
                System.out.println("Please Entered Invalid Key!");
                break;
        }
        sc.close();
    }

    private static void withdrawAmmount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Amount For Withdraw : ");
        int amount = sc.nextInt();
        if (amount <= balance) {
            System.out.println("You are Withdrawing " + amount);
            System.out.println("your Left Amount is :" + (balance - amount));
            balance = balance - amount;
        } else {
            System.out.println("Your Balance is InSufficient!");
        }
        sc.close();

    }

    private static void depositeAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount For Deposite :");
        int amount = sc.nextInt();
        System.out.println("You are Depositing " + amount + "/-");
        System.out.println("Your Total Amount is : " + (amount + balance));
        balance = balance + amount;
        sc.close();

    }

    private static void checkAcconutBalance() {
        System.out.println("Your Total Amount is : " + balance);
        System.out.println("Thanks For Visiting......");
    }

}

public class ATM_Machine {
    public static void main(String[] args) {
        ATM.checkPin();

    }
}