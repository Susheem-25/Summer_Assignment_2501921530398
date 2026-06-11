import java.util.*;
public class Q2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        int max=(num1>num2)?num1:num2;
        System.out.println("Maximum of "+num1+" and "+num2+" is "+max);
        sc.close();
    }
}
