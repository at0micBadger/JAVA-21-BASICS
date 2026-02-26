import java.math.BigDecimal;
import java.math.RoundingMode;

public class SmoothOps {
    public static void main(String[] args) {

     // PROGRAM START
    System.out.println("");
    System.out.println("START PROGRAM.");  
    
    System.out.println("");
    System.out.println("OPERATORS IN JAVA 21");
    System.out.println("");

    System.out.println("Mathematics Operators: ");
    System.out.println("");

    int firstNum = 99;
    int secondNum = 42;
    
    System.out.println("INTEGERS: ");

    int resultOne = firstNum + secondNum; 
    System.out.println("\tfirst result-addition:\t\t\t " + resultOne);

    int resultTwo = firstNum - secondNum; 
    System.out.println("\tsecond result-subtraction:\t\t " + resultTwo);

    int resultThree = firstNum * secondNum;
    System.out.println("\tthird result-multiplication:\t\t " + resultThree);

    int resultFour = firstNum / secondNum;
    System.out.println("\tfourth result-division:\t\t\t " + resultFour);

    int resultFive = firstNum % secondNum;
    System.out.println("\tfifth result-division:\t\t\t " + resultFive);

    System.out.println("");


    double thirdNum = 3.14;
    double fourthNum = 777.99;

    double doubleNumz1 = fourthNum + thirdNum;
    System.out.println("Decimal numbers-addition:\t\t\t " + doubleNumz1);

    BigDecimal itemPrice = new BigDecimal("19.99");
    BigDecimal taxRate   = new BigDecimal("0.085");
    BigDecimal quantity  = new BigDecimal("3");

    System.out.println("");
    System.out.println("BigDecimal Examples for financial values:");
    System.out.println("\titem price: \t\t\t\t" + itemPrice);
    System.out.println("\ttax rate: \t\t\t\t" + taxRate);
    System.out.println("\tquantity: \t\t\t\t" + quantity);

    System.out.println("");

    BigDecimal tax   = itemPrice.multiply(taxRate).setScale(2, RoundingMode.HALF_UP);
    BigDecimal total = itemPrice.multiply(quantity).add(tax).setScale(2, RoundingMode.HALF_UP);
    System.out.println("\ttax amount: \t\t\t\t" + tax);
    System.out.println("\ttotal (qty * price + tax): \t\t" + total);

    BigDecimal price = new BigDecimal("24.99");
    BigDecimal operand = new BigDecimal("5.37");

    System.out.println("\tStarting price: \t\t\t" + price);
    System.out.println("\tOperand: \t\t\t\t" + operand);

    System.out.println("");



    // Addition
    BigDecimal addedPrice = price.add(operand);
    System.out.println("\tAdded price: \t\t\t\t" + addedPrice);

    // Subtraction
    BigDecimal subtractedPrice = price.subtract(operand);
    System.out.println("\tSubtracted price: \t\t\t" + subtractedPrice);

    // Multiplication
    BigDecimal multipliedPrice = price.multiply(operand);
    System.out.println("\tMultiplied price: \t\t\t" + multipliedPrice);

    // Division (scale of 2, rounding half up to avoid ArithmeticException)
    BigDecimal dividedPrice = price.divide(operand, 2, RoundingMode.HALF_UP);
    System.out.println("\tDivided price: \t\t\t\t" + dividedPrice);

    // Modulus (remainder)
    BigDecimal modulusPrice = price.remainder(operand);
    System.out.println("\tModulus price: \t\t\t\t" + modulusPrice);

    // PROGRAM END
    System.out.println("");
    System.out.println("END PROGRAM.");
    System.out.println("");
    
    }
}
