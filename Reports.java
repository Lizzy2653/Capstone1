import java.util.Scanner;

public class Reports {

    public static void main(String[] args)
    { Scanner scanner = new Scanner(System.in);
    char choice;
    do {
    System.out.println("=== Report Menu ===");
    System.out.println("1) Month to Date");
    System.out.println("2) Previous Month");
    System.out.println("3) Year to Date");
    System.out.println("4) Previous Year");
    System.out.println("5) Search by Vendor");
    System.out.println("0) Back");
    System.out.println("H) Home");
    System.out.print("Enter your choice: ");

    choice = scanner.next().charAt(0);

    scanner.nextLine(); // Consume the newline character
    // switch (Character.toUpperCase(choice))
    // { case '1':
    // generateMonthToDateReport();
    // break;
    // case '2':
    // generatePreviousMonthReport();
    // break;
    // case '3':
    // generateYearToDateReport();
    // break;
    // case '4':
    // generatePreviousYearReport();
    // break;
    // case '5':
    // searchByVendor();
    // break;
    // case '0':
    // System.out.println("Returning to the previous menu.");
    // break;
    // case 'H':
    // System.out.println("Returning to the Home Screen.");
    // break;
    // default:
    // System.out.println("Invalid choice. Please try again.");
    // break; } } while (Character.toUpperCase(choice) != '0' && Character.toUpperCase(choice) != 'H');
    // scanner.close(); } private static void generateMonthToDateReport()
    // { System.out.println("Generating Month to Date Report...");
    // Implement the logic to generate the month-to-date report here.
    // } private static void generatePreviousMonthReport()
    // System.out.println("Generating Previous Month Report...");
    // Implement the logic to generate the previous month report here.
    // } private static void generateYearToDateReport()
    // { System.out.println("Generating Year to Date Report...");// Implement the logic to generate the year-to-date report here.
    // } private static void generatePreviousYearReport()
    // { System.out.println("Generating Previous Year Report...");
    // Implement the logic to generate the previous year report here.
    // } private static void searchByVendor() { System.out.println("Searching by Vendor...");
    // Implement the logic for searching by vendor here.
        }
    }
}
