import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Voting Eligibility Check ---");
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Status: You are eligible to vote.");
        } else if (age >= 0) {
            System.out.println("Status: You are NOT eligible to vote. You must be at least 18.");
        } else {
            System.out.println("Error: Invalid age entered.");
        }
        sc.close();
    }
}