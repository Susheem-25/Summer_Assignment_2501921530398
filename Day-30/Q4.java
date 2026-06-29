import java.util.*;
public class Q4 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String[] accounts = new String[100];
String[] passwords = new String[100];
double[] balances = new double[100];
int accCount = 0;
while (true) {
System.out.println("1.Create Account 2.Login 3.Exit");
int ch = sc.nextInt();
sc.nextLine();
if (ch == 3) break;
if (ch == 1) {
System.out.println("Enter username:");
accounts[accCount] = sc.nextLine();
System.out.println("Enter password:");
passwords[accCount] = sc.nextLine();
balances[accCount] = 0.0;
accCount++;
System.out.println("Account created successfully!");
} else if (ch == 2) {
System.out.println("Username:");
String u = sc.nextLine();
System.out.println("Password:");
String p = sc.nextLine();
int loggedInUser = -1;
for (int i = 0; i < accCount; i++) {
if (accounts[i].equals(u) && passwords[i].equals(p)) {
loggedInUser = i;
break;
}
}
if (loggedInUser != -1) {
while (true) {
System.out.println("1.Deposit 2.Withdraw 3.Balance 4.Logout");
int subCh = sc.nextInt();
if (subCh == 4) break;
if (subCh == 1) {
System.out.println("Amount:");
balances[loggedInUser] += sc.nextDouble();
} else if (subCh == 2) {
System.out.println("Amount:");
double amt = sc.nextDouble();
if (balances[loggedInUser] >= amt) balances[loggedInUser] -= amt;
else System.out.println("Insufficient funds!");
} else if (subCh == 3) {
System.out.println("Balance: $" + balances[loggedInUser]);
}
}
} else {
System.out.println("Invalid credentials!");
}
}
}
sc.close();
}
}