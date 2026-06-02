import java.util.*;
public class Q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter required number");
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num=num/10;
        }
        System.out.println("Sum of digits : " + sum);
        sc.close();
    }
}