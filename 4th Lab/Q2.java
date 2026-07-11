import java.util.Scanner;

class Q2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int dept = 2; // Fixed number of departments
        int[][][] arr = new int[dept][][]; // 3D Array to store hours
        int[][] sum = new int[dept][];     // Stores total hours per employee
        int[][] avg = new int[dept][];     // Stores average hours per employee

        // Step 1: Taking input for each department
        for (int i = 0; i < dept; i++) {
            System.out.print("How many Employees in Department " + (i + 1) + ": ");
            int emp = s.nextInt(); // Employees in the current department

            arr[i] = new int[emp][5]; // Each employee has 5 working days
            sum[i] = new int[emp];    // Initialize sum for employees in the department
            avg[i] = new int[emp];    // Initialize avg for employees in the department

            for (int j = 0; j < emp; j++) {
                System.out.println("Enter 5 working hours for Employee " + (j + 1) + " in Department " + (i + 1) + ":");
                
                for (int k = 0; k < 5; k++) {
                    arr[i][j][k] = s.nextInt();
                    sum[i][j] += arr[i][j][k]; // Accumulate total hours per employee
                }

                avg[i][j] = sum[i][j] / 5; // Calculate average
            }
        }

        // Step 2: Displaying the total and average working hours
        System.out.println("\nWeekly Working Hours of Employees:");
        for (int i = 0; i < dept; i++) {
            System.out.println("Department " + (i + 1) + ":");

            for (int j = 0; j < arr[i].length; j++) { // Loop through employees
                System.out.println("  Employee " + (j + 1) + " => Total Hours: " + sum[i][j] + ", Average Hours: " + avg[i][j]);
            }

            System.out.println(); // Space between departments
        }

        s.close(); // Close scanner
    }
}
