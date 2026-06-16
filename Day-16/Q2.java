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
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<n;i++){
            freq.put(arr[i], freq.getOrDefault(arr[i],0)+1);
        }
        int maxFreq=0;
        int maxNum=arr[0];
        for(int num:freq.keySet()){
            int count=freq.get(num);
            if(count>maxFreq){
                maxFreq=count;
                maxNum=num;
            }
        }
        System.out.println("Maximum frequency element is: "+maxNum);
        System.out.println("Frequency is: "+maxFreq);
        sc.close();
    }
}
