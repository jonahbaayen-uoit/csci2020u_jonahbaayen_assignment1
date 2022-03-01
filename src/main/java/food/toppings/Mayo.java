package food.toppings;

public class Mayo implements Topping {
    @Override
    public String name() {
        return "Mayo";
    }

    @Override
    public float extraCost() {
        return 0;
    }
}
