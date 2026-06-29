import java.util.*;
public class Q3 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String str = sc.nextLine();
while (true) {
System.out.println("1.Length 2.Uppercase 3.Reverse 4.Exit");
int ch = sc.nextInt();
if (ch == 4) break;
if (ch == 1) System.out.println("Length: " + str.length());
else if (ch == 2) System.out.println(str.toUpperCase());
else if (ch == 3) {
String rev = "";
for (int i = str.length() - 1; i >= 0; i--) rev += str.charAt(i);
System.out.println("Reversed: " + rev);
}
}
sc.close();
}
}