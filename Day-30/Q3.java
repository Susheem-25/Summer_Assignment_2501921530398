import java.util.*;
public class Q3 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String[] empNames = new String[100];
double[] salaries = new double[100];
int count = 0;
while (true) {
System.out.println("1.Add Employee 2.View All 3.Total Payout 4.Exit");
int ch = sc.nextInt();
sc.nextLine();
if (ch == 4) break;
if (ch == 1) {
System.out.println("Enter employee name:");
empNames[count] = sc.nextLine();
System.out.println("Enter salary:");
salaries[count] = sc.nextDouble();
count++;
} else if (ch == 2) {
for (int i = 0; i < count; i++) System.out.println(empNames[i] + " - $" + salaries[i]);
} else if (ch == 3) {
double total = 0;
for (int i = 0; i < count; i++) total += salaries[i];
System.out.println("Total Salary Payout: $" + total);
}
}
sc.close();
}
}