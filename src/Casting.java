// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Casting {
    public static void main(String[] args) {

        double decimalNumber = 112.35;
        System.out.println("Double: " + decimalNumber);

        int wholeNumber = (int)decimalNumber;
        System.out.println("int: " + wholeNumber + "\n");

        String numString = "49";
        System.out.println("The string value is: " + numString);

        int num = Integer.parseInt(numString);
        System.out.println("The integer value is: " + num);

        }
}