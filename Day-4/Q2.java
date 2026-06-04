import java.util.*;
public class Q2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int a = 0, b = 1, c=1;
        if(n <= 0){
            System.out.println("No terms to display");
        } 
        else if(n == 1){
            c=a;
        } 
        else{
            for (int i = 2; i<=n; i++) {
                c = a+b;
                a = b;
                b = c;
            }
        }
        System.out.println("The nth term of the Fibonacci series is: " + c);
        sc.close();
    }
}