import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();
        if (sentence.isEmpty()) {
            System.out.println("Total words: 0");
        } 
        else {
            String[] words = sentence.split("\\s+");
            System.out.println("Total words: " + words.length);
        }
        sc.close();
    }
}