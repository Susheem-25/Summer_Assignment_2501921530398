import java.util.*;
public class Q4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int count=0; // count of non-zero elements
		for(int i=0;i<n;i++){
			if(arr[i]!=0){
				arr[count++]=arr[i];
			}
		}
		while(count<n)
			arr[count++]=0;
		System.out.println("Array after moving zeros to end:");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		sc.close();
	}
}
