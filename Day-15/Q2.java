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
		System.out.println("Enter number of positions to rotate left");
		int d=sc.nextInt();
		d=d%n;
		int res[]=new int[n];
		for(int i=0;i<n;i++)
			res[i]=arr[(i+d)%n];
		System.out.println("Array after left rotation:");
		for(int i=0;i<n;i++)
			System.out.print(res[i]+" ");
		System.out.println();
		sc.close();
	}
}
