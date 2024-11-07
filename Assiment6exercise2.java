
package assiment.pkg6;
import java.util.Scanner;

public class Assiment6exercise2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Nhap kich co cua mang: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhap nguyen to cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double average = (double) sum / n;

        System.out.println("Tong cac phan tu: " + sum);
        System.out.println("Trung binh cua cac yeu to: " + average);
    }
}
