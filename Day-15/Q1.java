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
		for(int i=0;i<n/2;i++){
			int t=arr[i];
			arr[i]=arr[n-1-i];
			arr[n-1-i]=t;
		}
		System.out.println("Reversed array elements are:");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		sc.close();
	}
}
