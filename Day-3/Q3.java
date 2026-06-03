import java.util.*;
public class Q3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int temp=0;
        if(num1>=num2){
            temp=num2;
        }        
        else temp=num1;
        int gcd=1;
        for(int i=2;i<=temp;i++){
        if((num1%i==0) && (num2%i==0)){
            gcd=i;
        }
    }
    System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    sc.close();
}
}