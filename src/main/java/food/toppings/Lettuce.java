package food.toppings;

public class Lettuce implements Topping {
    @Override
    public String name() {
        return "Lettuce";
    }

    @Override
    public float extraCost() {
        return 0;
    }
}
