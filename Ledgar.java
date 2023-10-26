import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ledgar {

    class Entry {
    String date;
    String description;
    double amount;

        Entry(String date, String description, double amount) {
            { this.date = date;
              this.description = description;
              this.amount = amount;
            }
        }
        public class LedgerApp {
         private static List entries = new ArrayList<>();
         public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         char choice;

         do {
             System.out.println("=== Ledger Menu ===");
             System.out.println("A) All Entries");
             System.out.println("D) Deposits");
             System.out.println("P) Payments");
             System.out.println("R) Reports");

             System.out.println("H) Home");
             System.out.println("0) Exit");
             System.out.print("Enter your choice: ");

             choice = scanner.next().charAt(0);
                      scanner.nextLine();

             switch
             (Character.toUpperCase(choice)) {
                 case 'A':
                 viewAllEntries();
                 break;
                 case 'D':
                 viewDeposits();
                 break;
                 case 'P':
                 viewPayments();
                 break;
                 case 'R':

             handleReportsMenu(scanner);
                 break;
                 case 'H':

             System.out.println("Returning to the Home Screen.");
                 break;
                 case '0':

             System.out.println("Exiting the program. Goodbye!");
                 break;
                 default:

             System.out.println("Invalid choice. Please try again.");
                 break;
                 }
             }   while
         (Character.toUpperCase(choice) != '0);

                 scanner.close();
         }

         private static void viewAllEntries() {
             System.out.println("=== All Entries ===");
             for (Entry entry : entries) { System.out.println("Date: " + entry.date);
             System.out.println("Description: " + entry.description);
             System.out.println("Amount: " + entry.amount);
             System.out.println();
             }
         }
         private static void viewDeposits() {
             // Implement viewing deposits logic here}
         private static void viewPayments() { // Implement viewing payments logic here }

         private static void
         handleReportsMenu(Scanner scanner) {
             char choice;
             do {
                 System.out.println("=== Reports Menu ===");
                 System.out.println("1) Month to Date");
                 System.out.println("2) Previous Month");
                 System.out.println("3) Year to Date");
                 System.out.println("4) Previous Year");
                 System.out.println("5) Search by Vendor");
                 System.out.println("0) Back to Ledger Menu");
                 System.out.print("Enter your choice: ");

                 choice =
                 scanner.next().charAt(0);
                 scanner.nextLine(); // Consume the newline character

             switch
             (Character.toUpperCase(choice)) {
                 case '1':

             generateMonthToDateReport();
                 break;
                 case '2':
             generatePreviousMonthReport();
                 break;
                 case '3':
             generateYearToDateReport();
                 break;
                 case '4':
             generatePreviousYearReport();
                 break;
                 case '5':

             searchByVendor(scanner);
                 break;
                 case '0':

             System.out.println("Returning to the Ledger Menu.");
                 break;
                 default:

             System.out.println("Invalid choice. Please try again.");
                 break;
                  }
             }  while (Character.toUpperCase(choice) != '0);
         }

              private static void
              generateMonthToDateReport() {
              // Implement month to date report logic here
         }

              private static void
              generatePreviousMonthReport() {
              // Implement previous month report logic here
         }

             private static void
             generateYearToDateReport() {
             // Implement year to date report logic here
         }

             private static void
             generatePreviousYearReport() {
             // Implement previous year report logic here }

             private static void
             searchByVendor(Scanner scanner) {
             // Implement search by vendor logic here
             }
         }
