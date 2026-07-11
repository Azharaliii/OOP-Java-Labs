import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = sc.nextDouble();
        sc.close();

        double tax = 0;
        
        if (income <= 10000) {
            tax = income * 0.10;
        } else if (income <= 20000) {
            tax = 10000 * 0.10 + (income - 10000) * 0.15;
        } else {
            tax = 10000 * 0.10 + 10000 * 0.15 + (income - 20000) * 0.20;
        }
        
        System.out.println("Total tax owed: $" + tax);
    }
}
