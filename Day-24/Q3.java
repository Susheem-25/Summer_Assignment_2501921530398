import java.util.*;
public class Q3 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String str = sc.nextLine() + " ";
String longest = "";
String current = "";
for (int i = 0; i < str.length(); i++) {
if (str.charAt(i) != ' ') {
current = current + str.charAt(i);
} else {
if (current.length() > longest.length()) {
longest = current;
}
current = "";
}
}
System.out.println(longest);
sc.close();
}
}