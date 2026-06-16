import java.util.*;
public class Q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        int total=(n+1)*(n+2)/2;
        int missing=total-sum;
        System.out.println("Missing number is: "+missing);
        sc.close();
    }
}
