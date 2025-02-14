package Task3;

import java.util.ArrayList;
import java.util.Scanner;


public class ExpenseTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();
        double budget = 1000.00; // Example budget
        double totalSpent = 0.0;

        while (true) {
            System.out.println("\nExpense Tracker");
            System.out.println("1. Add Expense");
            System.out.println("2. View Monthly Summary");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter expense date (e.g., 2025-01-22): ");
                String date = scanner.nextLine();
                System.out.print("Enter expense amount: ");
                double amount = scanner.nextDouble();
                expenses.add(new Expense(date, amount));
                totalSpent += amount;
                System.out.println("Expense added successfully.");
            } else if (choice == 2) {
                double remainingBudget = budget - totalSpent;
                double averageSpent = expenses.isEmpty() ? 0 : totalSpent / expenses.size();

                System.out.println("\n--- Monthly Summary ---");
                System.out.println("Total Spent: $" + totalSpent);
                System.out.println("Average Daily Spending: $" + averageSpent);
                System.out.println("Remaining Budget: $" + remainingBudget);

                System.out.println("\n--- Expense Details ---");
                for (Expense expense : expenses) {
                    System.out.println(expense);
                }
            } else if (choice == 3) {
                System.out.println("Exiting Expense Tracker.");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}

