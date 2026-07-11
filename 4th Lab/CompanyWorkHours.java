import java.util.Scanner;

public class CompanyWorkHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask for the number of departments
        System.out.print("Enter the number of departments: ");
        int numDepartments = scanner.nextInt();

        // Step 2: Create a jagged array where each row represents a department
        int[][][] workHours = new int[numDepartments][][];

        // Step 3: Take input for each department
        for (int i = 0; i < numDepartments; i++) {
            System.out.print("Enter the number of employees in department " + (i + 1) + ": ");
            int numEmployees = scanner.nextInt();

            // Initialize the row for employees (each employee has 5 working days)
            workHours[i] = new int[numEmployees][5];

            // Step 4: Enter working hours for each employee
            for (int j = 0; j < numEmployees; j++) {
                System.out.println("Enter 5 days of working hours for Employee " + (j + 1) + " in Department " + (i + 1) + ":");
                for (int k = 0; k < 5; k++) {
                    workHours[i][j][k] = scanner.nextInt();
                }
            }
        }

        // Step 5: Display the entered working hours
        System.out.println("\nWeekly Working Hours of Employees:");
        for (int i = 0; i < workHours.length; i++) {
            System.out.println("Department " + (i + 1) + ":");
            for (int j = 0; j < workHours[i].length; j++) {
                System.out.print("  Employee " + (j + 1) + ": ");
                for (int k = 0; k < workHours[i][j].length; k++) {
                    System.out.print(workHours[i][j][k] + " ");
                }
                System.out.println(); // New line after each employee
            }
        }

        scanner.close();
    }
}
