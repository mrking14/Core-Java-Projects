package Java_Bill_Generator.billGenerator;

import java.util.Scanner;

public class Bill {

    static boolean pizzaType = false;
    // static int billAmount ;



    public static void main(String[] args) {

        int key;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome To King's Pizza! ");
        System.out.println("Which pizza Would You like to have?");
        System.out.println("Choose 1 for Delux Pizza : ");

        System.out.println("Choose 2 for Regular Pizza: ");
        key = sc.nextInt();
        switch (key) {
            case 1:
                pizzaType = true;
                deluxPizza();
                break;

            case 2:
                regularPizza();
                break;
        }

        sc.close();
    }

    private static void deluxPizza() {
        Pizza p1 = new Pizza(pizzaType);
        System.out.println("You Have Choosed Delux Pizza");
        billing(p1);
    }

    private static void regularPizza() {

        Pizza p1 = new Pizza(pizzaType);

        Scanner sc = new Scanner(System.in);
        System.out.println("You Have Choosed Regular Pizza.");
        System.out.println("Would you like to Add some Extra Stuffs?");
        System.out.println("Enter 1 for Adding : ");
        System.out.println("Enter 2 for Next : ");
        int a = sc.nextInt();
        if (a == 1) {
            optionRegular(p1);
        }else{
            billing(p1);
        }

        sc.close();
    }

    private static void optionRegular(Pizza p1) {
        int option;
        System.out.println("What would you like to add : ");
        System.out.println("Enter 1 for Extra Topping :");
        System.out.println("Enter 2 for Extra cheess :");
        System.out.println("Enter 3 for Adding Both :");
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();

        if (option == 1) {
            p1.addXtraChees();

        } else if (option == 2) {
            p1.addXtraTopping();

        } else if(option == 3) {
            p1.addXtraChees();
            p1.addXtraTopping();

        }

        billing(p1);

        sc.close();

    }

    private static void billing(Pizza p1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for DineIn 2 for TakeAway :");
        int key = sc.nextInt();
        if (key == 2) {
            p1.takeAway();
            System.out.println("you have choosed TakeAway.");
            System.out.println("Your Total Bill is: ");
            p1.billGenerate();
        } else {
            System.out.println("You choosed to DineIn:");
            p1.billGenerate();
        }
        sc.close();

        
    }

}
