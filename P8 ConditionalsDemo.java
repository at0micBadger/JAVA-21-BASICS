/**
 * ConditionalsDemo.java
 * Demonstrates commonly used conditional statements in Java 21:
 *   1. if statement
 *   2. if/else statement
 *   3. if / else if / else statement
 *   4. switch statement (traditional, with 5+ choices)
 *   5. ternary operator
 *   6. switch expression (modern arrow syntax, Java 16+)
 *   7. pattern matching with instanceof (Java 16+)
 */

public class ConditionalsDemo {

    public static void main(String[] args) {

        // -------------------------------------------------------
        // 1. IF STATEMENT
        //    Executes a block only when the condition is TRUE.
        // -------------------------------------------------------
        System.out.println("=== 1. IF Statement ===");

        int temperature = 95;

        if (temperature > 90) {
            System.out.println("It is very hot outside today!");
        }

        System.out.println();


        // -------------------------------------------------------
        // 2. IF / ELSE STATEMENT
        //    Executes one block when TRUE, another when FALSE.
        // -------------------------------------------------------
        System.out.println("=== 2. IF / ELSE Statement ===");

        int playerScore = 45;

        if (playerScore >= 50) {
            System.out.println("You passed the level!");
        } else {
            System.out.println("You did not pass the level. Try again!");
        }

        System.out.println();


        // -------------------------------------------------------
        // 3. IF / ELSE IF / ELSE STATEMENT
        //    Checks multiple conditions in order; the first TRUE
        //    branch runs, and the final else is the catch-all.
        // -------------------------------------------------------
        System.out.println("=== 3. IF / ELSE IF / ELSE Statement ===");

        int grade = 78;

        if (grade >= 90) {
            System.out.println("Letter grade: A");
        } else if (grade >= 80) {
            System.out.println("Letter grade: B");
        } else if (grade >= 70) {
            System.out.println("Letter grade: C");
        } else if (grade >= 60) {
            System.out.println("Letter grade: D");
        } else {
            System.out.println("Letter grade: F");
        }

        System.out.println();


        // -------------------------------------------------------
        // 4. SWITCH STATEMENT  (Java 21 enhanced switch expression)
        //    Matches a value against multiple specific cases.
        //    The default case handles anything not listed.
        // -------------------------------------------------------
        System.out.println("=== 4. SWITCH Statement ===");

        String day = "Wednesday";

        switch (day) {
            case "Monday":
                System.out.println("Start of the work week — time to get going!");
                break;
            case "Tuesday":
                System.out.println("Taco Tuesday! Keep the momentum going.");
                break;
            case "Wednesday":
                System.out.println("Hump day — you are halfway through the week!");
                break;
            case "Thursday":
                System.out.println("Almost Friday — the finish line is in sight.");
                break;
            case "Friday":
                System.out.println("TGIF! The weekend is just around the corner.");
                break;
            case "Saturday":
                System.out.println("Weekend! Time to relax and recharge.");
                break;
            case "Sunday":
                System.out.println("Sunday — rest up before the new week begins.");
                break;
            default:
                System.out.println("That is not a valid day of the week.");
                break;
        }

        System.out.println();


        // -------------------------------------------------------
        // 5. TERNARY OPERATOR
        //    A compact, single-line conditional.
        //    Syntax: variable = (condition) ? valueIfTrue : valueIfFalse;
        //    Best used for simple true/false assignments, not complex logic.
        // -------------------------------------------------------
        System.out.println("=== 5. Ternary Operator ===");

        int speed = 85;
        String speedStatus = (speed > 65) ? "Speeding" : "Within speed limit";
        System.out.println("Speed: " + speed + " mph — " + speedStatus);

        boolean isLoggedIn = true;
        String greeting = isLoggedIn ? "Welcome back!" : "Please log in.";
        System.out.println(greeting);

        int a = 42;
        int b = 17;
        int larger = (a > b) ? a : b;
        System.out.println("The larger of " + a + " and " + b + " is: " + larger);

        System.out.println("");

        // -------------------------------------------------------
        // 6. SWITCH EXPRESSION  (Java 16+, very common in Java 21)
        //    A modern upgrade to the traditional switch statement.
        //    Uses arrow syntax (->), needs no break statements,
        //    and can assign its result directly to a variable.
        // -------------------------------------------------------
        System.out.println("=== 6. Switch Expression ===");

        int month = 4;

        // The entire switch resolves to a single String value
        String season = switch (month) {
            case 12, 1, 2  -> "Winter";
            case 3, 4, 5   -> "Spring";
            case 6, 7, 8   -> "Summer";
            case 9, 10, 11 -> "Fall";
            default        -> "Unknown month";
        };

        System.out.println("Month " + month + " is in: " + season);

        // Switch expressions also work great inline with println
        int numItems = 1;
        System.out.println("You have " + numItems + " " +
            switch (numItems) {
                case 1  -> "item";
                default -> "items";
            } + " in your cart.");

        System.out.println();


        // -------------------------------------------------------
        // 7. PATTERN MATCHING WITH instanceof  (Java 16+)
        //    Before Java 16, you had to check the type and then
        //    cast separately. Now both happen in one expression.
        //    The cast variable (s, i, d) is only in scope when
        //    the condition is true -- no explicit cast needed.
        // -------------------------------------------------------
        System.out.println("=== 7. Pattern Matching with instanceof ===");

        Object[] mixedValues = { "Hello, Java!", 42, 3.14, true };

        for (Object value : mixedValues) {
            if (value instanceof String s) {
                System.out.println("String of length " + s.length() + ": " + s);
            } else if (value instanceof Integer i) {
                System.out.println("Integer doubled: " + (i * 2));
            } else if (value instanceof Double d) {
                System.out.println("Double rounded: " + Math.round(d));
            } else {
                System.out.println("Other type: " + value);
            }
        }

        System.out.println("End of Conditionals Demo.");
    }
}
