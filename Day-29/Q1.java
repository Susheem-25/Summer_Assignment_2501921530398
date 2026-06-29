import java.util.*;
public class Q1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
while (true) {
System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide 5.Exit");
int ch = sc.nextInt();
if (ch == 5) break;
System.out.println("Enter two numbers:");
double a = sc.nextDouble();
double b = sc.nextDouble();
if (ch == 1) System.out.println("Result: " + (a + b));
else if (ch == 2) System.out.println("Result: " + (a - b));
else if (ch == 3) System.out.println("Result: " + (a * b));
else if (ch == 4 && b != 0) System.out.println("Result: " + (a / b));
else if (ch == 4) System.out.println("Cannot divide by zero");
}
sc.close();
}
}