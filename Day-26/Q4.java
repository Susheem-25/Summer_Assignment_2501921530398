import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0, answer;
        System.out.println("--- Welcome to the Programming Quiz ---\nAnswer by typing the option number (1-4).\n");
        System.out.println("Q1. What is the size of an int variable in Java?\n1. 8 bits\n2. 16 bits\n3. 32 bits\n4. 64 bits");
        System.out.print("Your answer: ");
        answer = sc.nextInt();
        if (answer == 3) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is 3 (32 bits).\n");
        }
        System.out.println("Q2. Which company originally created Java?\n1. Sun Microsystems\n2. Microsoft\n3. Apple\n4. Google");
        System.out.print("Your answer: ");
        answer = sc.nextInt();
        if (answer == 1) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is 1 (Sun Microsystems).\n");
        }
        System.out.println("Q3. Which keyword is used to create a new object in Java?\n1. class\n2. new\n3. this\n4. create");
        System.out.print("Your answer: ");
        answer = sc.nextInt();
        if (answer == 2) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is 2 (new).\n");
        }
        System.out.println("--- Quiz Completed ---\nYour final score is: " + score + " out of 3");
        sc.close();
    }
}