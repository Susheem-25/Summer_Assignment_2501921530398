import java.util.*;
    public class Q4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(temp==rev)
            System.out.println("Number is Palindrom.");
        else
            System.out.println("Number i not Palindrome.");
        sc.close();
    }
}
