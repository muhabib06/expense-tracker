# Expense Tracker

A simple command-line based Java application to manage personal finances. The Expense Tracker allows users to add, list, and delete their expenses, with plans for future enhancements like CSV export, update functionality, and monthly/yearly summaries.

## Features

### Current Features:
- **Add an Expense**: Users can add expenses with a description and amount.
- **List All Expenses**: Lists all expenses with their details such as description, amount, and date.
- **Delete an Expense**: Remove an expense by its ID.
- **View Total Expenses**: Display the total sum of all recorded expenses.

### Future Features:
- **Update an Expense**: Modify an existing expense.
- **View Expenses by Month/Year**: Show total expenses for a given month or year.
- **CSV Export**: Export all expenses to a CSV file.
- **Expense Categories**: Group expenses by categories (e.g., food, travel).
- **Monthly Budget Warning**: Set a monthly budget and get notified when exceeded.

## How to Run

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/expense-tracker.git
    ```

2. Navigate to the project directory:

    ```bash
    cd expense-tracker/src/main/java
    ```

3. Compile the code:

    ```bash
    javac com/muhabib06/expensetracker/ExpenseTracker.java
    ```

4. Run the program:

    ```bash
    java com.muhabib06.expensetracker.ExpenseTracker
    ```

## Usage

### Adding an Expense:
To add an expense, simply follow the prompts in the application:

Enter description: Lunch Enter amount: 15


### Listing Expenses:

Choose an option: list ID: 1, Description: Lunch, Amount: $15, Date: 2024-09-12


### Deleting an Expense:
To delete an expense, enter the ID when prompted:

Choose an option: delete Enter expense ID to delete: 1 Expense deleted successfully.


### Viewing Total Expenses:

Choose an option: total Total expenses: $15

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

