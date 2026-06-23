import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = new int[256];
        for(int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i)] > 0) {
                System.out.println(s.charAt(i));
                return;
            }
            freq[s.charAt(i)]++;
        }
        sc.close();
    }
}