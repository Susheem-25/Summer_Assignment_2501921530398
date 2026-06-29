import java.util.*;
public class Q1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String[] names = new String[100];
int[] marks = new int[100];
int count = 0;
while (true) {
System.out.println("1.Add Student 2.View All 3.Search by Name 4.Exit");
int ch = sc.nextInt();
sc.nextLine();
if (ch == 4) break;
if (ch == 1) {
System.out.println("Enter student name:");
names[count] = sc.nextLine();
System.out.println("Enter marks:");
marks[count] = sc.nextInt();
count++;
} else if (ch == 2) {
for (int i = 0; i < count; i++) System.out.println(names[i] + " - Marks: " + marks[i]);
} else if (ch == 3) {
System.out.println("Enter name to search:");
String search = sc.nextLine();
for (int i = 0; i < count; i++) {
if (names[i].equals(search)) System.out.println("Found! Marks: " + marks[i]);
}
}
}
sc.close();
}
}