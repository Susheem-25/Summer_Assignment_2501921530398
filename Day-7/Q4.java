import java.util.*;
public class Q4{
    static int reverseHelper(int n, int reversed){
        if(n==0){
            return reversed;
        }
        return reverseHelper(n/10, reversed*10+n%10);
    }
    static int reverseNumber(int n){
        return reverseHelper(n, 0);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int result=reverseNumber(n);
        System.out.println("Reverse of "+n+" is "+result);
        sc.close();
    }
}
