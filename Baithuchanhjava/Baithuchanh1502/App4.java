package Baithuchanh1502.src;
import java.util.Scanner;
public class App4 {
    private static Scanner scanner;

    public static void main(String[] args) {
        int a, sum=0;
        try (Scanner sc = new Scanner(System.in)) {
        }
        do {
            System.out.println("Nhap số nguyen a: ");
            a=scanner.nextInt();
            sum += a;
        } while (sum<100); //tong lon hon 100 thi ket thuc
        System.out.println("Tong các so nguyen vua nhap= "+sum);
    }
}
