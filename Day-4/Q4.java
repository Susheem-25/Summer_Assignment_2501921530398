import java.util.*;
public class Q4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit");
        int lim=sc.nextInt();
        for(int i=1;i<=lim;i++){
        int num=i;
        int temp=num;
        int c=0;
        int n=num;
        while(n>0){
            n=n/10;
            c++;
        }
        int sum=0;
        n=temp;
        while(n>0){
            int rem=n%10;
            sum += (int) Math.pow(rem, c);
            n=n/10;
        }
        if(sum==temp){
            System.out.println(temp + " is an Armstrong number");
        } 
        }
        sc.close();
    }
}
