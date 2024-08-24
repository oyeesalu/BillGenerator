public class Pizza {
     private int price;
     private boolean veg;
     private int extraCheese = 100;
    private int extraToppings = 75;
    private int bagPack = 25;
    private int basePizzaPrice;
    boolean isExtraCheeseAdded = false;
    boolean isExtraToppingsAdded = false;
    boolean isTakeAwayOpted = false;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;

        }else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }
    public void addExtraCheese() {
        System.out.println("Extra cheese added");
        this.price += extraCheese;

    }
    public void addExtraToppings() {
        System.out.println("Extra toppings added");
        this.price += extraToppings;
    }
    public void takeAway() {
        System.out.println("Take away opted");
        this.price += bagPack;
    }
    public void generateBill() {
        String bill = "";
        System.out.println(this.price);
        System.out.println("Base :" + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese Added" + extraCheese + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings Added" + extraToppings + "\n";
        }
        if (isTakeAwayOpted) {
            bill += "BagPack included" + bagPack + "\n";
        }
        bill += "BILL :" + this.price + "\n";
        System.out.println(bill);
    }
}
