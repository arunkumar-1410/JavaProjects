
import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Expense expense = new Expense();
        int n;

        do {
            System.out.println("\n===== STUDENT EXPENSE TRACKER =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Total Expenses");
            System.out.println("4. Delete Expense");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            n = sc.nextInt();

            switch (n) {

                case 1:
                    System.out.print("Enter expense amount: ");
                    double amount = sc.nextDouble();
                    expense.addExpense(amount);
                    break;

                case 2:
                    expense.viewExpenses();
                    break;

                case 3:
                    expense.totalExpenses();
                    break;

                case 4:
                    System.out.print("Enter amount to delete: ");
                    double deleteAmount = sc.nextDouble();
                    expense.deleteExpense(deleteAmount);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (n != 5);

        sc.close();
    }
}
