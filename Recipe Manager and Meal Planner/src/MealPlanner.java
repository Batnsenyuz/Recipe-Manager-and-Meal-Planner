import java.util.HashMap;

public class MealPlanner {

    private HashMap<String, Recipe> weeklyPlan;

    public MealPlanner() {
        weeklyPlan = new HashMap<>();
    }

    public void planMeal(String day, Recipe recipe) {
        weeklyPlan.put(day, recipe);
    }

    public void showPlan() {
        System.out.println("Weekly Meal Plan:");
        for (String day : weeklyPlan.keySet()) {
            System.out.println(day + ": " + weeklyPlan.get(day).getName());
        }
    }

    // Shows the recipe for a specific day entered by the user
    public void showMealForDay(String day) {
        Recipe recipe = weeklyPlan.get(day);

        if (recipe != null) {
            System.out.println(recipe.getDetails());
        } else {
            System.out.println("No meal planned for " + day);
        }
    }
}
