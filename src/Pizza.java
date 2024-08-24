public class Pizza {
    int price;
    boolean veg;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;

        }else {
            this.price = 400;
        }
    }

    public void getPizzaPrice() {
        System.out.println(this.price);
    }
}
