import java.util.*;
public class Q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last range limit");
        int num = sc.nextInt();
        for(int j = 2; j <= num; j++){
            int c = 0;
            for(int i = 2; i < j; i++){
                if(j % i == 0){
                    c++;
                    break;
                }
            }
            if(c == 0){
                System.out.println(j + " is a prime number");
            } else {
                System.out.println(j + " is not a prime number");
            }
        }

        sc.close();
    }
}
