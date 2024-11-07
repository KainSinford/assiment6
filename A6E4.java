
package assiment.pkg6;
import java.util.Arrays;
public class A6E4 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};

        Arrays.sort(arr);

        System.out.println("Mang duoc sap xep:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}