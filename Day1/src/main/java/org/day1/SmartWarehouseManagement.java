package org.day1;

import java.lang.reflect.Array;
import java.util.ArrayList;

abstract class WarehouseItem {
    // Attributes
    private int itemId;
    private String itemName;

    // Constructor
    public WarehouseItem(int itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    abstract public void displayDetails();

    // Getter and setter

    public int getItemId() {
        return itemId;
    }
    public String getItemName() {
        return itemName;
    }
}

class Electronics extends WarehouseItem {
    // Attributes
    private static String itemType = "Electronics";

    // Constructor
    public Electronics(int itemId, String itemName) {
        super(itemId, itemName);
    }

    // Overriding displayDetails function
    @Override
    public void displayDetails() {
        System.out.println("Item Id: " + getItemId());
        System.out.println("Item Name: " + getItemName());
        System.out.println("Item Type: " + itemType);
    }
}

class Groceries extends WarehouseItem {
    // Attributes
    private static String itemType = "Groceries";

    // Constructor
    public Groceries(int itemId, String itemName) {
        super(itemId, itemName);
    }

    // Overriding displayDetails function
    @Override
    public void displayDetails() {
        System.out.println("Item Id: " + getItemId());
        System.out.println("Item Name: " + getItemName());
        System.out.println("Item Type: " + itemType);
    }
}

class Furniture extends WarehouseItem {
    // Attributes
    private static String itemType = "Furniture";

    // Constructor
    public Furniture(int itemId, String itemName) {
        super(itemId, itemName);
    }

    // Overriding displayDetails function
    @Override
    public void displayDetails() {
        System.out.println("Item Id: " + getItemId());
        System.out.println("Item Name: " + getItemName());
        System.out.println("Item Type: " + itemType);
    }
}

class Storage <T extends  WarehouseItem> {
    // Attribute
    ArrayList<T> warehouseitems;

    //Constructor
    public Storage() {
        warehouseitems = new ArrayList<>();
    }

    // Method to add item to the storage
    public void addItem(T item) {
        warehouseitems.add(item);
        System.out.println("Item successfully added to the storage.");
    }

    // Method to get the list of items stored
    public ArrayList<T> getItems() {
        return warehouseitems;
    }

    public static void displayItems(ArrayList<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayDetails();
            System.out.println("--------------------------------------");
        }
    }

}
public class SmartWarehouseManagement {
    public static void main(String[] args) {
        // Defining sample objects of Electronics, Groceries & Furniture class
        Storage<Electronics> electronicsStorage = new Storage<>();
        Electronics electronics1 = new Electronics(101, "Television");
        Electronics electronics2 = new Electronics(102, "Microwave");
        electronicsStorage.addItem(electronics1);
        electronicsStorage.addItem(electronics2);

        Storage<Groceries> groceriesStorage = new Storage<>();
        Groceries grocerie1 = new Groceries(201, "Milk");
        Groceries grocerie2 = new Groceries(202, "Bread");
        groceriesStorage.addItem(grocerie1);
        groceriesStorage.addItem(grocerie2);

        Storage<Furniture> furnitureStorage = new Storage<>();
        Furniture furniture1 = new Furniture(301, "Sofa");
        Furniture furniture2 = new Furniture(302, "Table");
        furnitureStorage.addItem(furniture1);
        furnitureStorage.addItem(furniture2);

        // Displaying details for each of the Warehouse item object
        Storage.displayItems(electronicsStorage.getItems());
        System.out.println("--------------------------------------");
        Storage.displayItems(groceriesStorage.getItems());
        System.out.println("--------------------------------------");
        Storage.displayItems(furnitureStorage.getItems());
    }
}
