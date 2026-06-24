import java.util.*;
public class Q1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String str1 = sc.nextLine();
String str2 = sc.nextLine();
boolean isRotation = false;
if (str1.length() == str2.length() && str1.length() > 0) {
for (int i = 0; i < str1.length(); i++) {
boolean match = true;
for (int j = 0; j < str1.length(); j++) {
if (str1.charAt((i + j) % str1.length()) != str2.charAt(j)) {
match = false;
break;
}
}
if (match) {
isRotation = true;
break;
}
}
}
System.out.println(isRotation);
sc.close();
}
}