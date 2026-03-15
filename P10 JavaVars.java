public class JavaVars {
    // ── CONSTANTS ──────────────────────────────────────────────────────
    static final String  LANGUAGE  = "Java 21";
    static final int     MAX_SCORE = 100;
    static final double  TAX_RATE  = 0.07;
    static final boolean IS_OPEN   = true;

    public static void main(String[] args) {

        // ── VARIABLES ──────────────────────────────────────────────────
        String  name    = "Alice";
        int     score   = 85;
        double  price   = 49.99;
        boolean isPaid  = false;

        // ── VAR (type inferred) ────────────────────────────────────────
        var  varName    = "Bob";       // inferred: String
        var  varScore   = 90;          // inferred: int
        var  varPrice   = 29.99;       // inferred: double
        var  varIsPaid  = true;        // inferred: boolean

        final var CONST_NAME    = "Carol";   // inferred: final String
        final var CONST_SCORE   = 95;        // inferred: final int
        final var CONST_PRICE   = 9.99;      // inferred: final double
        final var CONST_ISPAID  = false;     // inferred: final boolean

        // ── PRINT ──────────────────────────────────────────────────────
        System.out.println("=== Constants (static final) ===");
        System.out.println("LANGUAGE  : " + LANGUAGE);
        System.out.println("MAX_SCORE : " + MAX_SCORE);
        System.out.println("TAX_RATE  : " + TAX_RATE);
        System.out.println("IS_OPEN   : " + IS_OPEN);

        System.out.println("\n=== Variables ===");
        System.out.println("name   : " + name);
        System.out.println("score  : " + score);
        System.out.println("price  : " + price);
        System.out.println("isPaid : " + isPaid);

        System.out.println("\n=== var (type inferred) ===");
        System.out.println("varName   : " + varName);
        System.out.println("varScore  : " + varScore);
        System.out.println("varPrice  : " + varPrice);
        System.out.println("varIsPaid : " + varIsPaid);

        System.out.println("\n=== final var (inferred constants) ===");
        System.out.println("CONST_NAME   : " + CONST_NAME);
        System.out.println("CONST_SCORE  : " + CONST_SCORE);
        System.out.println("CONST_PRICE  : " + CONST_PRICE);
        System.out.println("CONST_ISPAID : " + CONST_ISPAID);
    }
}


