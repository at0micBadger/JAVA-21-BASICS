/**
 * OutputDemo.java
 * A Java 21 program demonstrating output statements, strings,
 * numeric data types, and width specifiers with printf.
 * Written for beginner programmers.
 */
public class OutputDemo {

    public static void main(String[] args) {

        // ============================================================
        // SECTION 1: The Three Print Methods
        // ============================================================
        System.out.println("=== SECTION 1: The Three Print Methods ===");
        System.out.println();

        System.out.println("-- println() always adds a newline at the end --");
        System.out.println("This is line one.");
        System.out.println("This is line two. Each println() starts a fresh line.");
        System.out.println();

        System.out.println("-- print() does NOT add a newline --");
        System.out.print("This is printed with print()... ");
        System.out.print("and this continues on the SAME line.");
        System.out.println();  // we manually move to the next line
        System.out.println();

        System.out.println("-- println() with no arguments just prints a blank line --");
        System.out.println("Line before the blank line.");
        System.out.println();   // <-- this prints a blank line, very useful for spacing!
        System.out.println("Line after the blank line.");
        System.out.println();

        System.out.println("-- printf() lets you format output precisely --");
        System.out.printf("Hello, %s! You are %d years old.%n", "Alice", 30);
        System.out.println("(We will explore printf in depth in Section 6.)");
        System.out.println();


        // ============================================================
        // SECTION 2: Escape Sequences
        // ============================================================
        System.out.println("=== SECTION 2: Escape Sequences ===");
        System.out.println();

        System.out.println("-- Escape sequences are special characters inside strings --");
        System.out.println("They always start with a backslash \\");
        System.out.println();

        System.out.println("-- \\n is a newline character --");
        System.out.println("Line one\nLine two\nLine three");
        System.out.println();

        System.out.println("-- \\t is a tab character, useful for spacing output --");
        System.out.println("Name\tAge\tCity");
        System.out.println("Alice\t30\tLexington");
        System.out.println("Bob\t25\tLouisville");
        System.out.println();

        System.out.println("-- \\\\ prints a single backslash --");
        System.out.println("C:\\Users\\Alice\\Documents");
        System.out.println();

        System.out.println("-- \\\" prints a double quote inside a string --");
        System.out.println("She said, \"Hello, World!\"");
        System.out.println();


        // ============================================================
        // SECTION 3: Strings
        // ============================================================
        System.out.println("=== SECTION 3: Strings ===");
        System.out.println();

        System.out.println("-- A String holds a sequence of characters in double quotes --");
        String firstName = "Alice";
        String lastName  = "Smith";
        System.out.println("firstName = " + firstName);
        System.out.println("lastName  = " + lastName);
        System.out.println();

        System.out.println("-- Strings can be joined with the + operator (concatenation) --");
        String fullName = firstName + " " + lastName;
        System.out.println("firstName + \" \" + lastName = " + fullName);
        System.out.println();

        System.out.println("-- Useful built-in String methods --");
        System.out.println("fullName.toUpperCase()  = " + fullName.toUpperCase());
        System.out.println("fullName.toLowerCase()  = " + fullName.toLowerCase());
        System.out.println("fullName.length()       = " + fullName.length());
        System.out.println("fullName.charAt(0)      = " + fullName.charAt(0));
        System.out.println();

        System.out.println("-- Text Blocks: a cleaner way to write multi-line strings --");
        System.out.println("(Available in Java 15 and later, including Java 21)");
        String profile = """
                Name:  Alice Smith
                Role:  Developer
                Level: Senior
                """;
        System.out.println(profile);


        // ============================================================
        // SECTION 4: Numeric Data Types
        // ============================================================
        System.out.println("=== SECTION 4: Numeric Data Types ===");
        System.out.println();

        System.out.println("-- Java has 4 integer types for whole numbers --");
        System.out.println("They differ in how large a number they can hold:");
        System.out.println();

        byte  byteVal  = 127;
        short shortVal = 32767;
        int   intVal   = 2147483647;
        long  longVal  = 8_000_000_000L;  // L suffix marks this as a long literal
                                           // underscores just make it easier to read

        System.out.println("byte  (8-bit,  max 127):           " + byteVal);
        System.out.println("short (16-bit, max 32,767):        " + shortVal);
        System.out.println("int   (32-bit, max ~2.1 billion):  " + intVal);
        System.out.println("long  (64-bit, very large):        " + longVal);
        System.out.println("Note: long literals need an L suffix, e.g. 8_000_000_000L");
        System.out.println();

        System.out.println("-- Java has 2 floating-point types for decimal numbers --");
        float  floatVal  = 9.99f;           // f suffix marks this as a float literal
        double doubleVal = 3.14159265358979;

        System.out.println("float  (32-bit, less precise):  " + floatVal);
        System.out.println("double (64-bit, more precise):  " + doubleVal);
        System.out.println("Note: float literals need an f suffix, e.g. 9.99f");
        System.out.println("Tip:  When in doubt, use double for decimal numbers.");
        System.out.println();

        System.out.println("-- boolean holds only true or false --");
        System.out.println("Beginners often print booleans while debugging their code.");
        boolean isStudent   = true;
        boolean isGraduated = false;
        System.out.println("isStudent   = " + isStudent);
        System.out.println("isGraduated = " + isGraduated);
        System.out.println();


        // ============================================================
        // SECTION 5: Common Beginner Gotchas
        // ============================================================
        System.out.println("=== SECTION 5: Common Beginner Gotchas ===");
        System.out.println();

        // --- Gotcha 1: Integer Division ---
        System.out.println("-- GOTCHA 1: Integer Division --");
        System.out.println("When you divide two int values, Java throws away the decimal.");
        System.out.println("This is called integer division and surprises almost every beginner.");
        System.out.println();

        int a = 5;
        int b = 2;
        System.out.println("a = 5, b = 2");
        System.out.println("a / b        = " + (a / b) +
                           "    <-- NOT 2.5! The .5 is silently discarded.");
        System.out.println();
        System.out.println("Fix: cast one value to double to force decimal division:");
        double divResult = (double) a / b;
        System.out.println("(double) a / b = " + divResult + "  <-- correct!");
        System.out.println();

        // --- Gotcha 2: The String Concatenation Trap ---
        System.out.println("-- GOTCHA 2: The String Concatenation Trap --");
        System.out.println("The + operator is evaluated left to right.");
        System.out.println("If Java sees a String on the left, all following + become");
        System.out.println("concatenation (joining), NOT addition.");
        System.out.println();

        int x = 3;
        int y = 4;
        System.out.println("x = 3, y = 4");
        System.out.println("\"Value: \" + x + y  ==>  " + "Value: " + x + y);
        System.out.println("This prints 'Value: 34', NOT 'Value: 7'!");
        System.out.println("Java sees the String 'Value: ' first, so + means join, not add.");
        System.out.println();
        System.out.println("Fix: use parentheses to force the addition to happen first:");
        System.out.println("\"Value: \" + (x + y)  ==>  " + "Value: " + (x + y));
        System.out.println();


        // ============================================================
        // SECTION 6: printf Format Specifiers
        // ============================================================
        System.out.println("=== SECTION 6: printf Format Specifiers ===");
        System.out.println();

        System.out.println("-- printf uses format specifiers as placeholders --");
        System.out.println("Each specifier starts with % and ends with a type letter:");
        System.out.println("  %s  = String");
        System.out.println("  %d  = integer (byte, short, int, long)");
        System.out.println("  %f  = floating-point (float or double)");
        System.out.println("  %b  = boolean");
        System.out.println("  %n  = newline (preferred over \\n inside printf)");
        System.out.println();

        String  name   = "Alice";
        int     age    = 30;
        double  gpa    = 3.875;
        boolean honors = true;

        System.out.printf("Name:    %s%n",   name);
        System.out.printf("Age:     %d%n",   age);
        System.out.printf("GPA:     %f%n",   gpa);    // default: 6 decimal places
        System.out.printf("GPA:     %.2f%n", gpa);    // .2 limits to 2 decimal places
        System.out.printf("Honors:  %b%n",   honors);
        System.out.println();

        System.out.println("-- You can mix multiple specifiers in one printf call --");
        System.out.println("The values are matched to specifiers left to right:");
        System.out.printf("Student %s (age %d) has a GPA of %.2f. Honors: %b%n",
                          name, age, gpa, honors);
        System.out.println();


        // ============================================================
        // SECTION 7: Width Specifiers
        // ============================================================
        System.out.println("=== SECTION 7: Width Specifiers ===");
        System.out.println();

        System.out.println("-- A width specifier reserves a fixed number of characters --");
        System.out.println("Put a number between % and the type letter to set the field width.");
        System.out.println("By default the value is RIGHT-aligned, padded with spaces on the left.");
        System.out.println();
        System.out.println("Format:  % [width] [.precision] type");
        System.out.println("Example: %13d  means: integer, right-aligned in a 13-char field");
        System.out.println("Example: %.2f  means: float with 2 decimal places");
        System.out.println("Example: %-15s means: string, LEFT-aligned in a 15-char field");
        System.out.println();

        System.out.println("-- Our original example: print 240 right-aligned in 13 chars --");
        int var_z = 240;
        System.out.printf("the number: %13d%n", var_z);
        System.out.println();

        System.out.println("-- Watching right-alignment as numbers grow larger --");
        System.out.printf("  %%13d with value 1:       %13d%n", 1);
        System.out.printf("  %%13d with value 99:      %13d%n", 99);
        System.out.printf("  %%13d with value 12345:   %13d%n", 12345);
        System.out.println();

        System.out.println("-- Add a minus sign before the width for LEFT-alignment --");
        System.out.printf("  %%-13d with value 1:       %-13d|%n", 1);
        System.out.printf("  %%-13d with value 99:      %-13d|%n", 99);
        System.out.printf("  %%-13d with value 12345:   %-13d|%n", 12345);
        System.out.println("  (The | character shows where the 13-char field ends)");
        System.out.println();

        System.out.println("-- If the value is wider than the field, Java prints it anyway --");
        System.out.println("Java will NEVER cut off your data to make it fit:");
        System.out.printf("  %%3d with value 123456:   %3d%n", 123456);
        System.out.println();

        System.out.println("-- Width works with Strings and floating-point numbers too --");
        System.out.printf("  %%15s  with 'hello':    %15s%n",  "hello");
        System.out.printf("  %%-15s with 'hello':    %-15s|%n", "hello");
        System.out.printf("  %%10.2f with 3.14159:   %10.2f%n", 3.14159);
        System.out.println();


        // ============================================================
        // SECTION 8: Aligned Columns
        // ============================================================
        System.out.println("=== SECTION 8: Aligned Columns ===");
        System.out.println();

        System.out.println("-- Width specifiers shine when printing data in table form --");
        System.out.println("Use the same format string for every row so columns line up.");
        System.out.println();

        System.out.printf("%-12s %6s %8s%n", "Student", "Score", "Average");
        System.out.println("-".repeat(28));
        System.out.printf("%-12s %6d %8.2f%n", "Alice",      95,  91.75);
        System.out.printf("%-12s %6d %8.2f%n", "Bob",       100,  98.50);
        System.out.printf("%-12s %6d %8.2f%n", "Charlotte",   88,  85.33);
        System.out.printf("%-12s %6d %8.2f%n", "Dan",         72,  74.10);
        System.out.println();


        // ============================================================
        // SECTION 9: String.formatted() -- Modern Alternative
        // ============================================================
        System.out.println("=== SECTION 9: String.formatted() ===");
        System.out.println();

        System.out.println("-- String.formatted() builds a formatted String without printing it --");
        System.out.println("Use it when you want to store the result in a variable first.");
        System.out.println();

        String scoreLabel = "Score: %d out of 100".formatted(95);
        System.out.println("Stored result: " + scoreLabel);
        System.out.println();

        System.out.println("-- It also pairs nicely with Text Blocks for clean reports --");
        String report = """
                === Student Report ===
                Name:  %s
                Age:   %d
                GPA:   %.2f
                """.formatted(name, age, gpa);
        System.out.println(report);


        // ============================================================
        // SECTION 10: Putting It All Together
        // ============================================================
        System.out.println("=== SECTION 10: Putting It All Together ===");
        System.out.println();

        System.out.println("-- A final example combining everything covered in this program --");
        System.out.println();

        String  studentName = "Alice Smith";
        int     score       = 95;
        double  studentGpa  = 3.875;
        long    studentId   = 1234567890L;
        float   tuition     = 18500.50f;
        boolean honorsRoll  = true;

        System.out.println("Simple output using println and concatenation:");
        System.out.println("Student: " + studentName + ", Score: " + score);
        System.out.println();

        System.out.println("Clean formatted output using printf:");
        System.out.printf("  Name:       %-20s%n", studentName);
        System.out.printf("  Student ID: %-20d%n", studentId);
        System.out.printf("  Score:      %-20d%n", score);
        System.out.printf("  GPA:        %-20.2f%n", studentGpa);
        System.out.printf("  Tuition:    $%,.2f%n", tuition);  // comma adds thousands separator
        System.out.printf("  Honors:     %-20b%n", honorsRoll);
        System.out.println();

        System.out.println("Integer division reminder from Section 5:");
        System.out.println("  score / 10         = " + (score / 10) +
                           "    (decimal dropped -- integer division)");
        System.out.println("  (double)score / 10 = " + ((double) score / 10) +
                           "  (cast to double first for correct result)");
    }
}
