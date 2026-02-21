public class PrimitiveDataTypes {
    public static void main(String[] args) {

        // byte: 8-bit integer (-128 to 127)
        byte myByte = 100;
        System.out.println("byte: " + myByte);

        // short: 16-bit integer (-32,768 to 32,767)
        short myShort = 30000;
        System.out.println("short: " + myShort);

        // int: 32-bit integer (-2^31 to 2^31-1)
        int myInt = 2147483647;
        System.out.println("int: " + myInt);

        // long: 64-bit integer (-2^63 to 2^63-1)
        long myLong = 9223372036854775807L; // note the 'L' suffix
        System.out.println("long: " + myLong);

        // float: 32-bit decimal
        float myFloat = 3.14f; // note the 'f' suffix
        System.out.println("float: " + myFloat);

        // double: 64-bit decimal (more precise than float)
        double myDouble = 3.141592653589793;
        System.out.println("double: " + myDouble);

        // char: single 16-bit Unicode character
        char myChar = 'A';
        System.out.println("char: " + myChar);

        // boolean: true or false
        boolean myBoolean = true;
        System.out.println("boolean: " + myBoolean);
    }
}
