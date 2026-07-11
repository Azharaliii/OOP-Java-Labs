class StudGrades{
    public static void main(String args[]) {
        int StudGrade[][] = {
            {1, 10, 80, 70, 40}, // Student 1
            {2, 70, 60, 30, 40}, // Student 2
            {3, 10, 20, 30, 40}  // Student 3
        };

        int sum[] = new int[3];  // To store sum of grades
        int avr[] = new int[3];  // To store average of grades
        int threshold = 40;      // Threshold for extra help

        System.out.println("Student Grades Summary:\n");

        for (int i = 0; i < 3; i++) {
            System.out.print("Student " + StudGrade[i][0] + " - Grades: ");
            
            sum[i] = 0; // Reset sum for each student
            
            for (int j = 1; j < 5; j++) { // Start from index 1 to skip student ID
                System.out.print(StudGrade[i][j] + " ");
                sum[i] += StudGrade[i][j]; // Add to sum
            }

            avr[i] = sum[i] / 4; // Calculate average
            System.out.print("| Total: " + sum[i] + " | Average: " + avr[i] + "%");

            // Identify students needing extra help
            if (avr[i] <= threshold) {
                System.out.print(" --> Needs Extra Help!");
            }

            System.out.println();
        }
    }
}
