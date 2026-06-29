import java.util.*;
public class Q4 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String[] items = new String[100];
int[] qty = new int[100];
int count = 0;
while (true) {
System.out.println("1.Add Item 2.View Inventory 3.Update Quantity 4.Exit");
int ch = sc.nextInt();
sc.nextLine();
if (ch == 4) break;
if (ch == 1) {
System.out.println("Enter item name:");
items[count] = sc.nextLine();
System.out.println("Enter quantity:");
qty[count] = sc.nextInt();
count++;
} else if (ch == 2) {
for (int i = 0; i < count; i++) System.out.println(i + ". " + items[i] + ": " + qty[i]);
} else if (ch == 3) {
System.out.println("Enter item ID and new quantity:");
int id = sc.nextInt();
int newQty = sc.nextInt();
if (id >= 0 && id < count) qty[id] = newQty;
}
}
sc.close();
}
}