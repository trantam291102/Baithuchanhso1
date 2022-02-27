package Baithuchanh1502.src;
import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        int a, b;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhập số thứ nhất: ");
            a = scanner.nextInt();
            System.out.println("Nhập số thứ hai: ");
            b = scanner.nextInt();
        }
        int min = a;//Gán giá trị của biến a cho min
        if(a>b)
        min=b;
        System.out.println("Số nhỏ nhất trong 2 số "+a+" và "+b+"là"+min);
    }
}
    