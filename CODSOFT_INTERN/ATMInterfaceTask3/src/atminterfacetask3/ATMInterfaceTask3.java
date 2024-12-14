/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atminterfacetask3;

/**
 *
 * @author Moshikaa Saravanan
 */
import java.io.*;
import java.util.Scanner;

public class ATMInterfaceTask3 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.start();
    }
}

class ATM {
    private final BankAccount account;

    public ATM() {
        account = new BankAccount();
    }

    public void start() {
        System.out.println("``````````````WELCOME TO KVB ATM INTERFACE``````````");

        // Check if account data exists
        if (account.loadData()) {
            System.out.println("Account found. Please log in.");
        } else {
            System.out.println("No account found. Please register.");
        }

        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Register\n2. Login\n3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                account.register();
            } else if (choice == 2) {
                System.out.println("1. Login\n2. Exit");
                System.out.print("Enter your choice: ");
                int option = sc.nextInt();

                if (option == 1) {
                    if (account.login()) {
                        System.out.println("Login successful! Welcome back!");
                        performATMOperations();
                    }
                } else if (option == 2) {
                    System.out.println("Thank you for using the ATM. Exiting...");
                    System.exit(0);
                } else {
                    System.out.println("Invalid choice! Please enter a valid option.");
                }
            } else if (choice == 3) {
                System.out.println("Thank you for using the ATM. Exiting...");
                System.exit(0);
            } else {
                System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }

    public void performATMOperations() {
        Scanner sc = new Scanner(System.in);
        boolean isFinished = false;
        while (!isFinished) {
            System.out.println("1. Withdraw\n2. Deposit\n3. Check Balance\n4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.withdraw();
                    break;
                case 2:
                    account.deposit();
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    isFinished = true;
                    System.out.println("Thank you for using the ATM. Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}

class BankAccount {
    private String name;
    private String username;
    private String password;
    private float balance;
    private final String accountFile = "accountData.txt"; // File to store user data

    public BankAccount() {
        this.balance = 0f;  // Initial balance set to 0
    }

    public void register() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        this.name = sc.nextLine();

        System.out.print("Enter your username: ");
        this.username = sc.nextLine();

        System.out.print("Enter your password: ");
        this.password = sc.nextLine();

        saveData();
        System.out.println("Registration successful!");
    }

    public boolean login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String inputUsername = sc.nextLine();

        if (inputUsername.equals(username)) {
            System.out.print("Enter your password: ");
            String inputPassword = sc.nextLine();

            if (inputPassword.equals(password)) {
                return true;
            } else {
                System.out.println("Incorrect password.");
                return false;
            }
        } else {
            System.out.println("Username not found.");
            return false;
        }
    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        float amount = sc.nextFloat();

        if (amount <= balance) {
            balance -= amount;
            saveData();
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        float amount = sc.nextFloat();

        balance += amount;
        saveData();
        System.out.println("Deposit successful!");
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    private void saveData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(accountFile))) {
            writer.write(username + "\n");
            writer.write(password + "\n");
            writer.write(balance + "\n");
            writer.write(name + "\n");
            System.out.println("Account data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving account data.");
        }
    }

    public boolean loadData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(accountFile))) {
            username = reader.readLine();
            password = reader.readLine();
            balance = Float.parseFloat(reader.readLine());
            name = reader.readLine();
            return true;
        } catch (IOException e) {
            System.out.println("No saved account found.");
            return false;
        }
    }
}
