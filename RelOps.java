public class RelOps {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 10;

        System.out.println("===========================================");
        System.out.println("   Relational Operators Demo — Java 21");
        System.out.println("===========================================");
        System.out.printf("  Values:  a = %d,  b = %d,  c = %d%n%n", a, b, c);

        // 1. Equal to (==)
        System.out.println("--- Equal to (==) ---");
        System.out.printf("  a == b  →  %d == %d  →  %b%n", a, b, a == b);
        System.out.printf("  a == c  →  %d == %d  →  %b%n%n", a, c, a == c);

        // 2. Not equal to (!=)
        System.out.println("--- Not equal to (!=) ---");
        System.out.printf("  a != b  →  %d != %d  →  %b%n", a, b, a != b);
        System.out.printf("  a != c  →  %d != %d  →  %b%n%n", a, c, a != c);

        // 3. Greater than (>)
        System.out.println("--- Greater than (>) ---");
        System.out.printf("  b > a   →  %d > %d   →  %b%n", b, a, b > a);
        System.out.printf("  a > b   →  %d > %d  →  %b%n%n", a, b, a > b);

        // 4. Less than (<)
        System.out.println("--- Less than (<) ---");
        System.out.printf("  a < b   →  %d < %d  →  %b%n", a, b, a < b);
        System.out.printf("  b < a   →  %d < %d   →  %b%n%n", b, a, b < a);

        // 5. Greater than or equal to (>=)
        System.out.println("--- Greater than or equal to (>=) ---");
        System.out.printf("  b >= a  →  %d >= %d  →  %b%n", b, a, b >= a);
        System.out.printf("  a >= c  →  %d >= %d  →  %b%n", a, c, a >= c);
        System.out.printf("  a >= b  →  %d >= %d  →  %b%n%n", a, b, a >= b);

        // 6. Less than or equal to (<=)
        System.out.println("--- Less than or equal to (<=) ---");
        System.out.printf("  a <= b  →  %d <= %d  →  %b%n", a, b, a <= b);
        System.out.printf("  a <= c  →  %d <= %d  →  %b%n", a, c, a <= c);
        System.out.printf("  b <= a  →  %d <= %d  →  %b%n%n", b, a, b <= a);

        // Practical example: using relational operators in conditions
        System.out.println("===========================================");
        System.out.println("   Practical Usage in Conditions");
        System.out.println("===========================================");

        int score = 75;
        System.out.println("  Student score: " + score);

        if (score >= 90) {
            System.out.println("  Grade: A");
        } else if (score >= 80) {
            System.out.println("  Grade: B");
        } else if (score >= 70) {
            System.out.println("  Grade: C");
        } else if (score >= 60) {
            System.out.println("  Grade: D");
        } else {
            System.out.println("  Grade: F");
        }

        // Stable Java 21 approach: if/else chain assigned to a String variable
        System.out.println();
        System.out.println("  Grade with Label (stable Java 21):");
        String grade;
        if      (score >= 90) grade = "A — Excellent";
        else if (score >= 80) grade = "B — Good";
        else if (score >= 70) grade = "C — Average";
        else if (score >= 60) grade = "D — Below Average";
        else                  grade = "F — Failing";
        System.out.println("  Score " + score + " → " + grade);

        System.out.println();
        System.out.println("===========================================");
        System.out.println("   Summary Table");
        System.out.println("===========================================");
        System.out.printf("  %-10s %-20s %-10s%n", "Operator", "Meaning", "Example (a=10,b=20)");
        System.out.println("  " + "-".repeat(42));
        System.out.printf("  %-10s %-20s %-10b%n", "==",  "Equal to",                  a == b);
        System.out.printf("  %-10s %-20s %-10b%n", "!=",  "Not equal to",              a != b);
        System.out.printf("  %-10s %-20s %-10b%n", ">",   "Greater than",              a > b);
        System.out.printf("  %-10s %-20s %-10b%n", "<",   "Less than",                 a < b);
        System.out.printf("  %-10s %-20s %-10b%n", ">=",  "Greater than or equal to",  a >= b);
        System.out.printf("  %-10s %-20s %-10b%n", "<=",  "Less than or equal to",     a <= b);
    }
}