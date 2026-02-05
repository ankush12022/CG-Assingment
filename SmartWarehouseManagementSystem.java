import java.util.*;

// Abstract base class
abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getCategory();
}

// Electronics item
class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }

    public String getCategory() {
        return "Electronics";
    }
}

// Groceries item
class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    public String getCategory() {
        return "Groceries";
    }
}

// Furniture item
class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    public String getCategory() {
        return "Furniture";
    }
}

// Generic Storage class with bounded type
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

// Main class
public class SmartWarehouseManagementSystem {

    // Wildcard method
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getName() + " - " + item.getCategory());
        }
    }

    public static void main(String[] args) {

        Storage<Electronics> electronics = new Storage<>();
        electronics.addItem(new Electronics("Laptop"));
        electronics.addItem(new Electronics("Mobile"));

        Storage<Groceries> groceries = new Storage<>();
        groceries.addItem(new Groceries("Rice"));
        groceries.addItem(new Groceries("Milk"));

        Storage<Furniture> furniture = new Storage<>();
        furniture.addItem(new Furniture("Chair"));
        furniture.addItem(new Furniture("Table"));

        System.out.println("Electronics Items:");
        displayItems(electronics.getItems());

        System.out.println("\nGroceries Items:");
        displayItems(groceries.getItems());

        System.out.println("\nFurniture Items:");
        displayItems(furniture.getItems());
    }
}
