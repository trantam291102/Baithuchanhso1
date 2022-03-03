import java.util.Scanner;
public class App74 {
    public static void main(String[] args) {
        System.out.println("Nhập vào số phần tử trong mảng: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double tong = 0;
        for(int i=0; i<arr.length; i++){
            System.out.println("Nhập vào giá trị cho phần tử thứ "+(i+1)+": ");
            arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){
            if (arr[i] % 2 != 0)
        {
            continue;
        }
        tong += arr[i];
        }
        System.out.printf("Tổng các phần tử chẵn trong mảng là: %.3f", tong);
    }
}
