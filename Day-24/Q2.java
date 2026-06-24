import java.util.*;
public class Q2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
if (str.isEmpty()) {
System.out.println(str);
return;
}
String compressed = "";
int countConsecutive = 0;
for (int i = 0; i < str.length(); i++) {
countConsecutive++;
if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
compressed = compressed + str.charAt(i) + countConsecutive;
countConsecutive = 0;
}
}
System.out.println(compressed.length() < str.length() ? compressed : str);
sc.close();
}
}