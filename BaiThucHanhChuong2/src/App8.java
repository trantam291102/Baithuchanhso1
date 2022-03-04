import java.util.Scanner;
public class App8 {
    public static void main(String[] args) {
        int n, sum = 0, a;
        float avgNumber;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhập vào số các số nguyên có trong dãy: ");
            n = scanner.nextInt();
            for (int count = 1; count <=n; count++) {
                System.out.println("Nhập số thứ " + count + ": ");
                a = scanner.nextInt();
                sum += a;
            }
        }
        avgNumber = (float) sum / n;
        System.out.println("Trung bình cộng = " + avgNumber);
    }
}
