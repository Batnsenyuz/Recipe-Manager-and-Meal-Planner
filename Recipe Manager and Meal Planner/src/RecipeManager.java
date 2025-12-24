import java.util.ArrayList;

public class RecipeManager {

    private ArrayList<Recipe> recipes;

    public RecipeManager() {
        recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public void listRecipes() {
        for (Recipe r : recipes) {
            System.out.println(r.getDetails());
        }
    }

    public Recipe getRecipeByName(String name) {
        for (Recipe r : recipes) {
            if (r.getName().equalsIgnoreCase(name)) {
                return r;
            }
        }
        return null;
    }
}
