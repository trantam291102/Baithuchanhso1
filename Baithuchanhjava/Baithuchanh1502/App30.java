package Baithuchanh1502.src;
import java.util.Scanner;
public class App30 {
    public static void main(String[] args) {
        int n,sodu,sum = 0;
        try (Scanner scanner = new Scanner(System.in)) 
            {
            System.out.println("Nhập vào số nguyên dương bất kỳ: ");
            n = scanner.nextInt();
   }
         
    while (n > 0) {
        sodu = n % 10;
        n = n / 10;
        sum += sodu;
    }
         
    System.out.println("Tổng các chữ số = " + sum);
    }
}
