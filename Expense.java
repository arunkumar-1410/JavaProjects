
import java.util.ArrayList;

public class Expense {

    ArrayList<Double> expenses = new ArrayList<>();

    public void addExpense(double amount) {

        if (amount <= 0) {
            System.out.println("Enter a valid amount.");
            return;
        }

        expenses.add(amount);
        System.out.println("Expense added successfully.");
    }

    public void totalExpenses() {

        double total = 0;

        for (double i : expenses) {
            total += i;
        }

        System.out.printf("Total Expenses: %.2f%n", total);
    }

    public void viewExpenses() {

        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }

        System.out.println("\nYour Expenses:");

        for (int i = 0; i < expenses.size(); i++) {
            System.out.printf("%d. %.2f%n", i + 1, expenses.get(i));
        }
    }

    public void deleteExpense(double amount) {

        if (expenses.remove(Double.valueOf(amount))) {
            System.out.println("Expense deleted successfully.");
        } else {
            System.out.println("Expense not found.");
        }
    }
}
