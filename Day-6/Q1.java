import java.util.*; 
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal =sc.nextInt();
        int originalDecimal = decimal; 
        String binary = "";
        if (decimal == 0) {
            binary = "0";
        } else {
            while (decimal > 0) {
                binary = (decimal % 2) + binary; 
                decimal = decimal / 2;
            }
        }
        System.out.println("Binary of " + originalDecimal + " is: " + binary); 
        sc.close();
    }
}