import java.util.*;
public class Q4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        long factorial=1;
        for(int i=1;i<=num;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+num+" is "+factorial);
        sc.close();
    }
}
