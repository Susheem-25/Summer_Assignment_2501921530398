import java.util.*;
public class Q4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base (x):");
        double x = sc.nextDouble();
        System.out.println("Enter exponent (n) (integer):");
        int n = sc.nextInt();
        double result = 1.0;
        int exp = Math.abs(n);
        double base = x;
        while(exp > 0){
            if((exp & 1) == 1) result = result * base;
            base = base * base;
            exp = exp >> 1;
        }
        if(n < 0) result = 1.0 / result;
        System.out.println(x + "^" + n + " = " + result);
        sc.close();
    }
}
