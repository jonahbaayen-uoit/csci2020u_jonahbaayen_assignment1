package food.toppings;

public class Bacon implements Topping {
    @Override
    public String name() {
        return "Bacon";
    }

    @Override
    public float extraCost() {
        return 0.75f;
    }
}
