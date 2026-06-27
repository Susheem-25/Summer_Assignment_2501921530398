import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int targetNumber = (int) (Math.random() * 100) + 1; 
        int guess = 0;
        int attempts = 0;
        System.out.println("--- Welcome to the Number Guessing Game ---");
        System.out.println("I have selected a number between 1 and 100.");
        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }
        sc.close();
    }
}