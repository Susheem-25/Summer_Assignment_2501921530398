import java.util.*;
public class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        long binary = sc.nextLong(); 
        long originalBinary = binary;
        int decimal = 0;
        int power = 0; 
        while (binary > 0){
            long lastDigit = binary % 10;
            decimal += lastDigit*Math.pow(2, power);
            binary = binary / 10;
            power++;
        }
         System.out.println("Decimal of " + originalBinary + " is: " + decimal);
         sc.close();
    }
}