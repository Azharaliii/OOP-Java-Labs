import java.util.Scanner;

class Q3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a valid password: ");
        String a = s.nextLine();

        // Check minimum length
        if (a.length() < 8) {
            System.out.println("Invalid! Password must be at least 8 characters.");
            return;
        }

        boolean hasLetter = false, hasDigit = false, hasSpecial = false;

        // Using a normal for loop instead of for-each
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch >= '0' && ch <= '9') hasDigit = true;
            else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) hasLetter = true;
            else hasSpecial = true;
        }

        // Final validation
        if (hasLetter && hasDigit && hasSpecial) {
            System.out.println("Password is valid!");
        } else {
            System.out.println("Invalid! Must contain a letter, a digit, and a special character.");
        }

        s.close();
    }
}
