import java.util.Scanner;

class Permitive_Data_Types{
    public static void main(String args[]) {
        // Create a single Scanner object for all inputs
        Scanner scanner = new Scanner(System.in);

        // Get the user's name
        System.out.println("Write Your Sweet Name: ");
        String name = scanner.nextLine(); // Use nextLine() for full name input

        // Get the user's age
        System.out.println("Write Your Sweet Age: ");
        int age = scanner.nextInt(); // Use nextInt() for integer input

        // Get the user's gender
        System.out.println("Gender (M/F): ");
        char gender = scanner.next().charAt(0); // Use next().charAt(0) for single character input

        // Display the collected information
        System.out.println("\n--- Your Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}