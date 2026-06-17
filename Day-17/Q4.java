import java.util.*;
public class Q4 {
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
        int minSize = n1 < n2 ? n1 : n2;
        int[] commonArr = new int[minSize];
        int count = 0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    boolean isPresent = false;
                    for (int k = 0; k < count; k++) {
                        if (commonArr[k] == arr1[i]) {
                            isPresent = true;
                            break;
                        }
                    }
                    if (!isPresent) {
                        commonArr[count] = arr1[i];
                        count++;
                    }
                    break;
                }
            }
        }
        System.out.print("Common elements: ");
        for (int i = 0; i < count; i++) {
            System.out.print(commonArr[i] + " ");
        }
        sc.close();
    }
}