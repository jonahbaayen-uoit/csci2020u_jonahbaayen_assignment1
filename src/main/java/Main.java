import food.meal.Meal;

public class Main {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal meal1 = mealBuilder.standardMeal();
        meal1.printMeal();

        Meal meal2 = mealBuilder.deluxeMeal();
        meal2.printMeal();
    }
}
