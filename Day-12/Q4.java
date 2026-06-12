import java.util.*;

public class Q4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(perfect(n))
            System.out.println(n+" is a perfect number");
        else
            System.out.println(n+" is not a perfect number");
        sc.close();
    }

    public static boolean perfect(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
                sum+=i;
        }
        return sum==n;
    }
}
