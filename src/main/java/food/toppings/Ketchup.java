package food.toppings;

public class Ketchup implements Topping {
    @Override
    public String name() {
        return "Ketchup";
    }

    @Override
    public float extraCost() {
        return 0;
    }
}
