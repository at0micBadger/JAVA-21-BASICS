import java.util.Scanner;

public class HolyGrail {
    public static void main(String[] args) {

        // 1. Set up Scanner to get input from the user
        Scanner scanner = new Scanner(System.in);

        // 2. Use strings to ask the three questions
        System.out.println("STOP!");
        System.out.println("He who would cross the Bridge of Death");
        System.out.println("must answer me these questions three!");
        System.out.println();

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("What is your quest? ");
        String quest = scanner.nextLine();

        System.out.print("What is your favorite color? ");
        String color = scanner.nextLine();

        // 3. Use concatenation to build and output a response
        System.out.println();
        System.out.println("Very well, " + name + ".");
        System.out.println("You seek " + quest + ", and your favorite color is " + color + ".");
        System.out.println("You may cross the Bridge of Death... for now.");

        scanner.close();
    }
}
