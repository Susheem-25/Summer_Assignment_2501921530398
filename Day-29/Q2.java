import java.util.*;
public class Q2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter array size:");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter elements:");
for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
while (true) {
System.out.println("1.Display 2.Sum 3.Maximum 4.Exit");
int ch = sc.nextInt();
if (ch == 4) break;
if (ch == 1) {
for (int x : arr) System.out.print(x + " ");
System.out.println();
} else if (ch == 2) {
int sum = 0;
for (int x : arr) sum += x;
System.out.println("Sum: " + sum);
} else if (ch == 3) {
int max = arr[0];
for (int x : arr) if (x > max) max = x;
System.out.println("Max: " + max);
}
}
sc.close();
}
}