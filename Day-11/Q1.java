import java.util.*;
public class Q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("Sum of "+num1+" and "+num2+" is "+sum);
        sc.close();
    }
}
