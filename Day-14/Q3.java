import java.util.*;
public class Q3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		if(n<2){
			System.out.println("Array must have at least two elements");
			sc.close();
			return;
		}
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int largest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(arr[i]>largest){
				second=largest;
				largest=arr[i];
			} else if(arr[i]>second && arr[i]!=largest){
				second=arr[i];
			}
		}
		System.out.println("Array elements are:");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		if(second==Integer.MIN_VALUE)
			System.out.println("No second largest element");
		else
			System.out.println("Second largest element is: "+second);
		sc.close();
	}
}
