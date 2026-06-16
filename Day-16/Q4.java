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
        int res[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            boolean duplicate=false;
            for(int j=0;j<k;j++){
                if(arr[i]==res[j]){
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate)
                res[k++]=arr[i];
        }
        System.out.println("Array after removing duplicates:");
        for(int i=0;i<k;i++)
            System.out.print(res[i]+" ");
        System.out.println();
        sc.close();
    }
}
