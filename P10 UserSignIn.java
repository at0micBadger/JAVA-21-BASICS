import java.util.Scanner;

/**
 * UserSignIn.java
 * Collects and displays user sign-in registration details.
 * Uses primitive datatypes, Strings, Scanner input, and basic output.
 * Java 21 — no loops or unnecessary branches.
 */
public class UserSignIn {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("       User Registration - Sign In Setup      ");
        System.out.println("==============================================");
        System.out.println();

        // ── 1. Username ──────────────────────────────────────────────
        System.out.print("Enter username: ");
        String username = scanner.nextLine().trim();

        if (username.isEmpty()) {
            System.out.println("ERROR: Username cannot be blank. Exiting.");
            scanner.close();
            return;
        }

        // ── 2. Password ──────────────────────────────────────────────
        System.out.print("Enter password: ");
        String password = scanner.nextLine().trim();

        if (password.isEmpty()) {
            System.out.println("ERROR: Password cannot be blank. Exiting.");
            scanner.close();
            return;
        }

        // ── 3. Job Role ──────────────────────────────────────────────
        System.out.print("Enter job role: ");
        String jobRole = scanner.nextLine().trim();

        if (jobRole.isEmpty()) {
            System.out.println("ERROR: Job role cannot be blank. Exiting.");
            scanner.close();
            return;
        }

        // ── 4. Email Address ─────────────────────────────────────────
        System.out.print("Enter email address: ");
        String email = scanner.nextLine().trim();

        if (email.isEmpty() || !email.contains("@") || !email.contains(".")) {
            System.out.println("ERROR: Please enter a valid email address. Exiting.");
            scanner.close();
            return;
        }

        // ── 5. Home Address ──────────────────────────────────────────
        System.out.print("Enter home address: ");
        String homeAddress = scanner.nextLine().trim();

        if (homeAddress.isEmpty()) {
            System.out.println("ERROR: Home address cannot be blank. Exiting.");
            scanner.close();
            return;
        }

        // ── 6. 6-Digit Numeric Passcode ──────────────────────────────
        System.out.print("Enter a 6-digit numeric passcode: ");
        String passcodeInput = scanner.nextLine().trim();

        if (passcodeInput.length() != 6) {
            System.out.println("ERROR: Passcode must be exactly 6 digits. Exiting.");
            scanner.close();
            return;
        }

        // Validate that every character is a digit
        boolean allDigits = passcodeInput.chars().allMatch(Character::isDigit);
        if (!allDigits) {
            System.out.println("ERROR: Passcode must contain numbers only. Exiting.");
            scanner.close();
            return;
        }

        int passcode = Integer.parseInt(passcodeInput);

        scanner.close();

        // ── Output ───────────────────────────────────────────────────
        System.out.println();
        System.out.println("==============================================");
        System.out.println("         Registration Details Captured        ");
        System.out.println("==============================================");
        System.out.println();
        System.out.println("Username:");
        System.out.println("\t" + username);
        System.out.println();
        System.out.println("Password:");
        System.out.println("\t" + password);
        System.out.println();
        System.out.println("Job Role:");
        System.out.println("\t" + jobRole);
        System.out.println();
        System.out.println("Email Address:");
        System.out.println("\t" + email);
        System.out.println();
        System.out.println("Home Address:");
        System.out.println("\t" + homeAddress);
        System.out.println();
        System.out.println("Passcode:");
        System.out.printf("\t%06d%n", passcode);
        System.out.println();
        System.out.println("==============================================");
        System.out.println("        Registration complete. Welcome!       ");
        System.out.println("==============================================");
    }
}
