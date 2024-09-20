package com.muhabib06.expensetracker;

import com.muhabib06.expensetracker.models.Expense;
import com.muhabib06.expensetracker.services.ExpenseService;

import java.util.Date;
import java.util.Scanner;

public class ExpenseTracker {
    private static ExpenseService expenseService = new ExpenseService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose an option: add, list, delete, total, exit");
            String choice = scanner.nextLine();

            switch (choice.toLowerCase()) {
                case "add":
                    addExpense(scanner);
                    break;
                case "list":
                    listExpenses();
                    break;
                case "delete":
                    deleteExpense(scanner);
                    break;
                case "total":
                    showTotalExpenses();
                    break;
                case "exit":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }

    private static void addExpense(Scanner scanner) {
        System.out.println("Enter description:");
        String description = scanner.nextLine();

        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        Expense expense = new Expense(expenseService.getAllExpenses().size() + 1, description, amount, new Date());
        expenseService.addExpense(expense);
        System.out.println("Expense added successfully.");
    }

    private static void listExpenses() {
        for (Expense expense : expenseService.getAllExpenses()) {
            System.out.println("ID: " + expense.getId() + ", Description: " + expense.getDescription() +
                    ", Amount: $" + expense.getAmount() + ", Date: " + expense.getDate());
        }
    }

    private static void deleteExpense(Scanner scanner) {
        System.out.println("Enter expense ID to delete:");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        expenseService.deleteExpense(id);
        System.out.println("Expense deleted successfully.");
    }

    private static void showTotalExpenses() {
        System.out.println("Total expenses: $" + expenseService.getTotalExpenses());
    }
}
