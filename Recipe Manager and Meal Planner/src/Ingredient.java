public class Ingredient {
    private String name;
    private String amount;
    private int calories;

    public Ingredient(String name, String amount, int calories) {
        this.name = name;
        this.amount = amount;
        this.calories = calories;
    }

    public Ingredient(String name, String amount) {
        this(name, amount, 000);
    }

    @Override
    public String toString() {
        return name + " (" + amount + ") - " + calories + " kcal";
    }
}