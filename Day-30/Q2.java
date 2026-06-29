import java.util.*;
public class Q2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String[] books = new String[100];
boolean[] isIssued = new boolean[100];
int count = 0;
while (true) {
System.out.println("1.Add Book 2.Issue 3.Return 4.View 5.Exit");
int ch = sc.nextInt();
sc.nextLine();
if (ch == 5) break;
if (ch == 1) {
System.out.println("Enter book title:");
books[count] = sc.nextLine();
isIssued[count] = false;
count++;
} else if (ch == 2) {
System.out.println("Enter book ID to issue:");
int id = sc.nextInt();
if (id >= 0 && id < count && !isIssued[id]) isIssued[id] = true;
} else if (ch == 3) {
System.out.println("Enter book ID to return:");
int id = sc.nextInt();
if (id >= 0 && id < count && isIssued[id]) isIssued[id] = false;
} else if (ch == 4) {
for (int i = 0; i < count; i++) System.out.println(i + ". " + books[i] + " (Issued: " + isIssued[i] + ")");
}
}
sc.close();
}
}