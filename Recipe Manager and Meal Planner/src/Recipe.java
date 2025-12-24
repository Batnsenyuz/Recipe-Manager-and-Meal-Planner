import java.util.ArrayList;

public class Recipe extends Item {

    private static int idCounter = 1;
    private ArrayList<Ingredient> ingredients;
    // Yeni eklenen özellikler
    private int prepTime; // minute
    private String difficulty;

    public Recipe(String name, int prepTime, String difficulty) {
        super(idCounter++, name);
        this.ingredients = new ArrayList<>();
        this.prepTime = prepTime;
        this.difficulty = difficulty;
    }

    public Recipe(String name) {
        this(name, 20, "Medium"); // Varsayılan değerler
    }

    // ----- METHODS -----
    public void addIngredient(String name, String amount) {
        ingredients.add(new Ingredient(name, amount));
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------------\n");
        sb.append("Recipe: ").append(name).append("\n");
        sb.append("Prep Time: ").append(prepTime).append(" mins\n");
        sb.append("Difficulty: ").append(difficulty).append("\n");
        sb.append("Ingredients:\n");
        for (Ingredient i : ingredients) {
            sb.append("- ").append(i).append("\n");
        }
        sb.append("--------------------------");
        return sb.toString();
    }
}