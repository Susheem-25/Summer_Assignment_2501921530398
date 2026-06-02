import java.util.*;
public class Q3 {
    public static void main(String args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter required number");
        int num=sc.nextInt();
        int pro=1;
        while(num>0){
            int rem=num%10;
            pro=pro*rem;
            num=num/10;
        }
        System.out.println(pro);
        sc.close();
    }
}
