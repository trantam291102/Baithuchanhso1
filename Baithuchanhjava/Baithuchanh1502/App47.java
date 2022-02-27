package Baithuchanh1502.src;
import java.util.Scanner;
public class App47 {
    private static Scanner scanner;

    public static void main(String[] args) {
        int a, sum=0;
        try (Scanner sc = new Scanner(System.in)) {
        }
        do {
            System.out.println("Nhập số nguyên a: ");
            a=scanner.nextInt();
            sum += a;
        } while (sum<100); //tổng lớn hơn 100 thì kết thúc
        System.out.println("Tổng các số nguyên vừa nhập= "+sum);
    }
}
