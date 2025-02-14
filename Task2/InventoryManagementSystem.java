package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class InventoryManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> inventory = new ArrayList<>();

        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. View Inventory");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter product name: ");
                String name = scanner.nextLine();
                System.out.print("Enter product price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter stock quantity: ");
                int stock = scanner.nextInt();
                inventory.add(new Product(name, price, stock));
                System.out.println("Product added successfully.");
            } else if (choice == 2) {
                System.out.print("Enter the product name to remove: ");
                String name = scanner.nextLine();
                inventory.removeIf(product -> product.name.equalsIgnoreCase(name));
                System.out.println("Product removed successfully.");
            } else if (choice == 3) {
                if (inventory.isEmpty()) {
                    System.out.println("Inventory is empty.");
                } else {
                    System.out.println("Current Inventory:");
                    for (Product product : inventory) {
                        System.out.println(product);
                    }
                }
            } else if (choice == 4) {
                System.out.println("Exiting Inventory Management System.");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}