import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        RecipeManager recipeManager = new RecipeManager();
        MealPlanner mealPlanner = new MealPlanner();
        Scanner scanner = new Scanner(System.in);

        // Monday
        Recipe pasta = new Recipe("Pasta");
        pasta.addIngredient("Pasta", "200g");
        pasta.addIngredient("Tomato Sauce", "100ml");

        // Tuesday
        Recipe salad = new Recipe("Salad");
        salad.addIngredient("Lettuce", "1 bowl");
        salad.addIngredient("Olive Oil", "2 tbsp");

        // Wednesday
        Recipe chickenRice = new Recipe("Chicken Rice");
        chickenRice.addIngredient("Chicken Breast", "250g");
        chickenRice.addIngredient("Rice", "150g");
        chickenRice.addIngredient("Onion", "1 piece");
        chickenRice.addIngredient("Olive Oil", "1 tbsp");

        // Thursday
        Recipe beefStirFry = new Recipe("Beef Stir Fry");
        beefStirFry.addIngredient("Beef Strips", "200g");
        beefStirFry.addIngredient("Broccoli", "100g");
        beefStirFry.addIngredient("Soy Sauce", "2 tbsp");

        // Friday
        Recipe grilledFish = new Recipe("Grilled Fish");
        grilledFish.addIngredient("Salmon Fillet", "200g");
        grilledFish.addIngredient("Lemon", "0.5 piece");
        grilledFish.addIngredient("Asparagus", "5 spears");

        // Saturday
        Recipe lentilSoup = new Recipe("Lentil Soup");
        lentilSoup.addIngredient("Red Lentils", "1 cup");
        lentilSoup.addIngredient("Carrot", "1 piece");
        lentilSoup.addIngredient("Water", "1 liter");

        // Sunday
        Recipe omelette = new Recipe("Omelette");
        omelette.addIngredient("Eggs", "3 pieces");
        omelette.addIngredient("Cheese", "50g");
        omelette.addIngredient("Mushrooms", "4 pieces");

        // ----- ADD RECIPES TO MANAGER -----
        recipeManager.addRecipe(pasta);
        recipeManager.addRecipe(salad);
        recipeManager.addRecipe(chickenRice);
        recipeManager.addRecipe(beefStirFry);
        recipeManager.addRecipe(grilledFish);
        recipeManager.addRecipe(lentilSoup);
        recipeManager.addRecipe(omelette);

        // ----- WEEKLY PLAN -----
        mealPlanner.planMeal("Monday", pasta);
        mealPlanner.planMeal("Tuesday", salad);
        mealPlanner.planMeal("Wednesday", chickenRice);
        mealPlanner.planMeal("Thursday", beefStirFry);
        mealPlanner.planMeal("Friday", grilledFish);
        mealPlanner.planMeal("Saturday", lentilSoup);
        mealPlanner.planMeal("Sunday", omelette);

        // ----- USER INPUT -----
        System.out.println("Enter a day (Monday to Sunday):");
        String day = scanner.nextLine().trim();

        // Display the meal for the chosen day
        mealPlanner.showMealForDay(day);

        scanner.close();
    }
}