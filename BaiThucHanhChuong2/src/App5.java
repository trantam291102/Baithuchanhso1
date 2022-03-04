import java.util.Scanner;
public class App5 {
    public static void main(String[] args) {
        float sum = 0, a;
    try (Scanner scanner = new Scanner(System.in)) {
        do {
            System.out.println("Nhập vào số a:");
            a = scanner.nextFloat();
            sum += a;
            if (sum > 100)
                break;
        } while (a > 0);
    }     
    System.out.println("Tổng các số vừa nhập là " + sum);
    }
}