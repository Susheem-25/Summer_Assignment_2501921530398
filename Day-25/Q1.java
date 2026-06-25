import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for(int i=0; i<n1; i++) a1[i] = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for(int i=0; i<n2; i++) a2[i] = sc.nextInt();
        int[] res = new int[n1+n2];
        int i=0, j=0, k=0;
        while(i<n1 && j<n2) {
            if(a1[i] <= a2[j]) res[k++] = a1[i++];
            else res[k++] = a2[j++];
        }
        while(i<n1) res[k++] = a1[i++];
        while(j<n2) res[k++] = a2[j++];
        for(int x : res) System.out.print(x + " ");
        sc.close();
    }
}