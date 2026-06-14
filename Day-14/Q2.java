import java.util.*;
public class Q2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter element to find frequency");
		int key=sc.nextInt();
		int freq=0;
		for(int i=0;i<n;i++){
			if(arr[i]==key)
				freq++;
		}
		System.out.println("Array elements are:");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		System.out.println("Frequency of "+key+" is: "+freq);
		sc.close();
	}
}
