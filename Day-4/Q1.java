import java.util.*;
public class Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements for series");
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        if(n <= 0){
            System.out.println("No terms to display");
        } 
        else if(n == 1){
            System.out.println(a);
        } 
        else{
            System.out.print(a + " " + b);
            for (int i = 2; i < n; i++) {
                c = a + b;
                System.out.print(" " + c);
                a = b;
                b = c;
            }
        }
        sc.close();
    }
}