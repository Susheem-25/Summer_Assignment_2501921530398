import java.util.*;
public class Q4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows=sc.nextInt();
        char ch='A';
        for(int i=1;i<=rows;i++){
            for(int s=1;s<=rows-i;s++){
                System.out.print(" ");
            }
            char c='A';
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
        sc.close();
    }
}
