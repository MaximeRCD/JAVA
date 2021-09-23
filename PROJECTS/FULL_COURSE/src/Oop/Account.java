package Oop;

import java.util.Scanner;

public class Account {
    public enum TypeAccount {Current, Saving}

    private double balance;
    private final long number;
    private final TypeAccount type;

    public Account(double initial_balance, long num, TypeAccount type) {
        this.balance = initial_balance;
        this.number = num;
        this.type = type;
    }

    public Account(){
        this.balance=0;
        this.number=0;
        this.type=TypeAccount.Current;
    }


    public void withdraw(double amount) {
        if (balance > amount) {
            this.balance -= amount;
        }
        if (balance == amount) {
            System.out.println("Be careful you'll have no money left");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to proceed the withdraw Y/N");
            String respond = scanner.nextLine();
            if (respond.equals("Y")) {
                this.balance -= amount;
            }
            scanner.close();
        } else {
            System.out.println("You want to withdraw " + amount + " but you have no sufficient balance");
        }
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void Display() {
        System.out.println("Your account number " + number + " has a balance " + balance + "  and is of type " + type);
    }
}
