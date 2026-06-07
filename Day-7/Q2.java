import java.util.*;
public class Q2{
    public static long fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        long result=fibonacci(n);
        System.out.println("Fibonacci of "+n+" is "+result);
        sc.close();
    }
}