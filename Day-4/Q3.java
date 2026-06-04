import java.util.*;
public class Q3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        int temp=num;
        int c=0;
        int n=num;
        while(n>0){
            n=n/10;
            c++;
        }
        int sum=0;
        n=num;
        while(n>0){
            int rem=n%10;
            sum += Math.pow(rem, c);
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
        sc.close();
    }
    
}
