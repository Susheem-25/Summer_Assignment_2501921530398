import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] unionArr = new int[n1 + n2];
        int unionCount = 0;
        for (int i = 0; i < n1; i++) {
            boolean isPresent = false;
            for (int j = 0; j < unionCount; j++) {
                if (arr1[i] == unionArr[j]) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                unionArr[unionCount] = arr1[i];
                unionCount++;
            }
        }
        for (int i = 0; i < n2; i++) {
            boolean isPresent = false;
            for (int j = 0; j < unionCount; j++) {
                if (arr2[i] == unionArr[j]) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                unionArr[unionCount] = arr2[i];
                unionCount++;
            }
        }
        System.out.print("Union of arrays: ");
        for (int i = 0; i < unionCount; i++) {
            System.out.print(unionArr[i] + " ");
        }
        sc.close();
    }
}