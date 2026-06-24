import java.util.*;
public class Q4 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
String result = "";
for (int i = 0; i < str.length(); i++) {
boolean found = false;
for (int j = 0; j < result.length(); j++) {
if (result.charAt(j) == str.charAt(i)) {
found = true;
break;
}
}
if (!found) {
result = result + str.charAt(i);
}
}
System.out.println(result);
sc.close();
}
}