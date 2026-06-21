import java.util.*;
public class Q4 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter lowercase string: ");
String str = sc.nextLine();
String result = "";
for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);
if (ch >= 'a' && ch <= 'z') {
result += (char) (ch - 32);
} else {
result += ch;
}
}
System.out.println("Uppercase: " + result);
sc.close();
}
}