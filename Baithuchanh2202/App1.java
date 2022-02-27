import java.util.Scanner;
public class App1 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất:");
        a = (int)scanner.nextInt();
        System.out.print("Nhập số thứ hai:");
        b = (int)scanner.nextInt();
        scanner.close();
        while (a != b) {
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.printf("Ước chung lớn nhất là: %d", b);
    }
}