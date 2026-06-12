import java.util.*;

public class Q2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(armstrong(n))
            System.out.println(n+" is an Armstrong number");
        else
            System.out.println(n+" is not an Armstrong number");
        sc.close();
    }

    public static boolean armstrong(int n){
        int temp=n;
        int digits=0;
        while(temp>0){
            digits++;
            temp/=10;
        }
        temp=n;
        int sum=0;
        while(temp>0){
            int d=temp%10;
            int p=1;
            for(int i=0;i<digits;i++)
                p*=d;
            sum+=p;
            temp/=10;
        }
        return sum==n;
    }
}
