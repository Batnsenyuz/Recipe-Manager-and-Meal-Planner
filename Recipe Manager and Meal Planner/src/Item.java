public abstract class Item {
    protected int id;
    protected String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract String getDetails();

    public String getName() {
        return name;
    }
}
