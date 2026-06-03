import java.util.*;
public class Q4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int abs1 = num1;
        int abs2 = num2;
        if(abs1 < 0){
            abs1 = -abs1;
        }
        if(abs2 < 0){
            abs2 = -abs2;
        }

        int lcm = 0;
        if(abs1 == 0 || abs2 == 0){
            lcm = 0;
        } else {
            int candidate = abs1 > abs2 ? abs1 : abs2;
            while(true){
                if(candidate % abs1 == 0 && candidate % abs2 == 0){
                    lcm = candidate;
                    break;
                }
                candidate++;
            }
        }

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        sc.close();
    }
}
