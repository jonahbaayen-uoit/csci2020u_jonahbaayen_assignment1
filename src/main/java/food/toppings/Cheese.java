package food.toppings;

public class Cheese implements Topping {
    @Override
    public String name() {
        return "Cheese";
    }

    @Override
    public float extraCost() {
        return 0.50f;
    }
}
