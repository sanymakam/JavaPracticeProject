package org.example;

import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        int originalBalance = 10000;
        int withdrawAmount;
        System.out.println("Welcome to ATM Machine");
        System.out.println("Please select one of the following options:");
        System.out.println("1. Withdraw Money");
        System.out.println("2. Check Balance");
        System.out.println("3. Exit");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option){
            case 1:
                System.out.println("Enter the amount you want to withdraw:");
                withdrawAmount = scanner.nextInt();
                if(withdrawAmount > originalBalance){
                    System.out.println("Insufficient Balance");
                } else {
                    originalBalance = originalBalance - withdrawAmount;
                    System.out.println("Please collect your cash");
                    System.out.println("Remaining Balance: " + originalBalance);
                }
                break;
            case 2:
                System.out.println("Your current balance is: " + originalBalance);
                break;
            case 3:
                System.out.println("Thank you for using ATM Machine");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
