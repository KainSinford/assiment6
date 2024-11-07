
package assiment.pkg6;
import java.util.Scanner;
public class A6E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhap kich co cua mang: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhap nguyen to cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhap nguyen to de dem: ");
        int elementToCount = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == elementToCount) {
                count++;
            }
        }

        System.out.println("Occurrences of " + elementToCount + ": " + count);
    }
}

