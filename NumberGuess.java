import java.util.Scanner;

/**
 * NumberGuess.java
 * Java 21 program that evaluates user-inputted numbers using relational operators.
 * Avoids traditional if/else by using ternary operators, String.format, and boolean expressions.
 * Includes double evaluations for Pi and 99.5.
 */
public class NumberGuess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("        Welcome to Number Guess!        ");
        System.out.println("========================================\n");

        // ── Evaluation 1: Is the number greater than 100? ──────────────────────
        System.out.println("[ Evaluation 1: The Century Test ]");
        System.out.print("Enter a whole number: ");
        int num1 = scanner.nextInt();

        boolean isGreaterThan100 = num1 > 100;
        String result1 = isGreaterThan100
                ? num1 + " is GREATER than 100. You went above the century mark!"
                : num1 + " is NOT greater than 100. Stay below the century!";
        System.out.println("Result: " + result1);
        System.out.println();

        // ── Evaluation 2: Is the number equal to a secret value? ───────────────
        final int SECRET = 42;
        System.out.println("[ Evaluation 2: The Secret Number Test ]");
        System.out.print("I'm thinking of a secret number. Enter your guess (whole number): ");
        int num2 = scanner.nextInt();

        boolean isSecret = num2 == SECRET;
        boolean tooHigh  = num2 > SECRET;
        String result2 = isSecret
                ? "Correct! " + num2 + " is the secret number!"
                : (tooHigh
                        ? num2 + " is too HIGH. The secret number is lower."
                        : num2 + " is too LOW. The secret number is higher.");
        System.out.println("Result: " + result2);
        System.out.println();

        // ── Evaluation 3: Is the number negative? ──────────────────────────────
        System.out.println("[ Evaluation 3: The Sign Test ]");
        System.out.print("Enter any whole number (positive or negative): ");
        int num3 = scanner.nextInt();

        boolean isNegative = num3 < 0;
        boolean isZero     = num3 == 0;
        String sign        = isNegative ? "NEGATIVE" : (isZero ? "ZERO" : "POSITIVE");
        int absApprox      = isNegative ? -num3 : num3;
        System.out.printf("Result: %d is %s%s%n",
                num3,
                sign,
                isZero ? "." : String.format(". Its absolute value is %d.", absApprox));
        System.out.println();

        // ── Evaluation 4: Is the number divisible by 7? ────────────────────────
        System.out.println("[ Evaluation 4: The Divisibility Test ]");
        System.out.print("Enter a whole number to check if it is divisible by 7: ");
        int num4 = scanner.nextInt();

        boolean divisibleBy7 = (num4 % 7) == 0;
        String result4 = divisibleBy7
                ? num4 + " IS divisible by 7. Lucky number!"
                : num4 + " is NOT divisible by 7. Remainder: " + (num4 % 7);
        System.out.println("Result: " + result4);
        System.out.println();

        // ── Evaluation 5: Guess Pi (double) ────────────────────────────────────
        final double PI = Math.PI;  // 3.141592653589793
        System.out.println("[ Evaluation 5: The Pi Guess Test ]");
        System.out.printf("Can you guess Pi to at least 4 decimal places? (%.5f)%n", PI);
        System.out.print("Enter a decimal number: ");
        double guess5 = scanner.nextDouble();

        boolean exactPi    = guess5 == PI;
        boolean withinPi   = Math.abs(guess5 - PI) <= 0.0001;
        boolean abovePi    = guess5 > PI;
        String result5 = exactPi
                ? "Perfect! You entered exactly Pi!"
                : (withinPi
                        ? String.format("%.5f is within 0.0001 of Pi — close enough, well done!", guess5)
                        : (abovePi
                                ? String.format("%.5f is ABOVE Pi (%.5f). A little too high!", guess5, PI)
                                : String.format("%.5f is BELOW Pi (%.5f). A little too low!", guess5, PI)));
        System.out.println("Result: " + result5);
        System.out.println();

        // ── Evaluation 6: Guess 99.5 (double) ──────────────────────────────────
        final double TARGET = 99.5;
        System.out.println("[ Evaluation 6: The 99.5 Challenge ]");
        System.out.print("Try to guess exactly 99.5. Enter a decimal number: ");
        double guess6 = scanner.nextDouble();

        boolean exactTarget  = guess6 == TARGET;
        boolean aboveTarget  = guess6 > TARGET;
        boolean withinTarget = Math.abs(guess6 - TARGET) <= 0.5;
        String result6 = exactTarget
                ? "Spot on! You guessed exactly 99.5!"
                : (withinTarget
                        ? String.format("%.2f is within 0.5 of 99.5 — very close!", guess6)
                        : (aboveTarget
                                ? String.format("%.2f is ABOVE 99.5. Try coming down a bit.", guess6)
                                : String.format("%.2f is BELOW 99.5. Try going a bit higher.", guess6)));
        System.out.println("Result: " + result6);
        System.out.println();

        // ── Summary ────────────────────────────────────────────────────────────
        System.out.println("========================================");
        System.out.println("              Summary                   ");
        System.out.println("========================================");
        System.out.printf("  Eval 1 | %-6d   > 100?        %b%n",   num1, isGreaterThan100);
        System.out.printf("  Eval 2 | %-6d  == 42?         %b%n",   num2, isSecret);
        System.out.printf("  Eval 3 | %-6d   < 0?          %b%n",   num3, isNegative);
        System.out.printf("  Eval 4 | %-6d %% 7 == 0?      %b%n",   num4, divisibleBy7);
        System.out.printf("  Eval 5 | %-8.4f ~= Pi?      %b%n",     guess5, withinPi);
        System.out.printf("  Eval 6 | %-8.2f == 99.5?    %b%n",     guess6, exactTarget);
        System.out.println("========================================");
        System.out.println("Thanks for playing Number Guess!");

        scanner.close();
    }
}
