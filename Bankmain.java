import java.util.Scanner;

public class Bankmain {
     public static void main(String[] args) {
        // Create a new bank
        Bankapp myBank = new Bankapp();
        Scanner scanner = new Scanner(System.in);

        // Add some accounts
        Account account1 = new Account();
        Account account2 = new Account();

        account1.setAccountNumber(1001);
        account1.setAccountHolder("Seyi");
        account1.setAccountBalance(500);

        account2.setAccountNumber(1002);
        account2.setAccountHolder("Daniel");
        account2.setAccountBalance(1500);


        myBank.addAccount(account1);
        myBank.addAccount(account2);

        int currentAccountNumber = -1; // Initialize to an invalid value
        String currentAccountHolder = ""; // Initialize to an empty string

        // Ask the user to enter an account number
        while (true) {
            System.out.print("Please enter your account number: ");
            int enteredAccountNumber = scanner.nextInt();

            // Check if the entered account number exists
            Account enteredAccount = myBank.findAccount(enteredAccountNumber);
            if (enteredAccount == null) {
                System.out.println("Account number " + enteredAccountNumber + " doesn't exist.");
                continue; // Prompt the user to enter another account number
            }

            currentAccountNumber = enteredAccountNumber;
            currentAccountHolder = enteredAccount.getAccountHolder();
            break; // Valid account number, exit the loop
        }

        while (true) {
            // Display a personalized greeting with the account holder's name
            System.out.println("Hello " + currentAccountHolder + ", please choose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Account Balance");
            System.out.println("4. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    myBank.performTransaction(currentAccountNumber, depositAmount, "deposit");
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    myBank.performTransaction(currentAccountNumber, withdrawAmount, "withdraw");
                    break;
                case 3:
                    myBank.checkBalance(currentAccountNumber);
                    break;
                case 4:
                    System.out.println("Exiting the bank app. Thank you!");
                    scanner.close();
                    System.exit(0); // Exit the program
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
                    break;
            }
        }
    }
}
    

