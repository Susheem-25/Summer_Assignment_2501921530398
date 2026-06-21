import java.util.*;
public class Q1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter string: ");
String str = sc.nextLine();
int length = 0;
for (char c : str.toCharArray()) {
length++;
}
System.out.println("Length: " + length);
sc.close();
}
}