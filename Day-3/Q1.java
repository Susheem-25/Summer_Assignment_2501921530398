import java.util.*;
public class Q1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter required number to be checked");
        int num=sc.nextInt();
        int c=0;
        for(int i=2;i<num;i++){
          if(num%i==0){
            c++;
          }
        }
        if(c==0){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
        sc.close();
    }
}
    