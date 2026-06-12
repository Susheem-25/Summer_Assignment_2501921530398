import java.util.*;

public class Q3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println("Fibonacci number at position "+n+" is "+fibonacci(n));
        sc.close();
    }

    public static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int a=0, b=1;
        for(int i=2;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}
