import java.util.*;
class Q2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double balance = 0;
while(true) {
System.out.println("1.Deposit 2.Withdraw 3.Balance 4.Exit");
int ch = sc.nextInt();
if(ch == 1) {
System.out.println("Amount to deposit:");
balance += sc.nextDouble();
} else if(ch == 2) {
System.out.println("Amount to withdraw:");
double amt = sc.nextDouble();
if(amt <= balance) {
balance -= amt;
} else {
System.out.println("Insufficient funds");
}
} else if(ch == 3) {
System.out.println("Balance: " + balance);
} else if(ch == 4) {
break;
}
}
sc.close();
}
}