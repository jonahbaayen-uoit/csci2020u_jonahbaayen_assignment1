package food.drinks;

public class Coffee extends Drink {
    @Override
    public String name() {
        return "Coffee";
    }

    @Override
    public float price() {
        return 2.0f;
    }

    @Override
    public boolean hasIce() {
        return false;
    }
}
