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
        isExtraCheeseAdded = true;
        this.price += extraCheese;

    }
    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppings;
    }
    public void takeAway() {
        isTakeAwayOpted = true;
        this.price += bagPack;
    }
    public void generateBill() {
        String bill = "";
        System.out.println("Base :" + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese :" + extraCheese + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings :" + extraToppings + "\n";
        }
        if (isTakeAwayOpted) {
            bill += "BagPack included..." + bagPack + "\n";
        }
        bill += "BILL :" + this.price + "\n";
        System.out.println(bill);
    }
}
