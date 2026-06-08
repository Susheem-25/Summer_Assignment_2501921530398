import java.util.*;
public class Q3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=0;j<i;j++){
				System.out.print((char)('A'+j));
			}
			System.out.println();
		}
		sc.close();
	}
}
