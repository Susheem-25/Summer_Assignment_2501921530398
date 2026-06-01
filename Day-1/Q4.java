import java.util.*;
public class Q4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        int res=0;
        while(n>0){
            n /= 10;
            res++;
        }
        System.out.println("The number of digits in the given number is "+res);
        sc.close();
    }
}
