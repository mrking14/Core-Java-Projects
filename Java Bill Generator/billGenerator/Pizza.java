package Java_Bill_Generator.billGenerator;

public class Pizza {

    private  int price;
    private boolean delux;
    private int xtraCheese = 60;
    private int xtraTopping = 40;
    private int takeAway = 50;

    Pizza(boolean delux) {
        this.delux = delux;
        if (this.delux)
            price = 400;
        else
            price = 300;

    }

    public void addXtraChees() {
        System.out.println("Extra Chees is added:");
        this.price += xtraCheese;

    }

    public void addXtraTopping() {
        System.out.println("Exrta Toppinig is added:");
        this.price += xtraTopping;

    }

    public void takeAway() {
        System.out.println("You have choosed to Pizza TakeAway:");
        this.price += takeAway;

    }

    public void billGenerate() {

        System.out.println("Your Total Bill  is: " + price);

    }

}
