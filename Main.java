package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        public record FinancialEntry(String date, String time, String description, String vendor, Double amount);

        scanner scanner = new Scanner(System.in);
        char choice;

        do {System.out.println("Home Screen");
            System.out.println("D)") "Add Deposit");"
            System.out.println("P);
            System.out.println("L) Ledger");
            System.out.println("X) Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.next().charAt(0); scanner.nextLine();

            switch (Character.toUpperCase(choice)) { case 'D': System.out.println("You chose to Add Deposit.");

            break; case 'P': System.out.println("You chose to Make Payment (Debit).") break; case 'L': System.out.println("You chose to view the Ledger.");
            break; case 'X': System.out.println("Exiting the program. Goodbye!");
            break; default: System.out.println("Invalid choice. Please try again.");
            break; }

            } while (Character.toUpperCase(choice) != 'X'); scanner.close(); } }

}

    }
