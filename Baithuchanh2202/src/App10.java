import java.util.Scanner;
public class App10 {
    public static void main(String[] args) {
        int a, count = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhập vào 1 số nguyên dương bất kỳ: ");
            a = scanner.nextInt();
            while (a <= 0) {
                System.out.println("Số nhập vào phải lớn hơn 0. Mời bạn nhập lại: ");
                a = scanner.nextInt();
            }
        }
        while (a > 0) {
            a /= 10;
            count++;   
        }
         
        System.out.println("Số các chữ số = " + count);
    }
}
