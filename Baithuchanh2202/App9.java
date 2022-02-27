import java.util.Scanner;
public class App9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b, reversed = 0;
        System.out.println("\n\nNhập vào số cần đảo ngược: ");
        a = sc.nextInt();
        b = a;
        while(a != 0) {
          int digit = a % 10;
          reversed = reversed * 10 + digit;
          a /= 10;
        }
        System.out.printf("Số %d sau khi đảo ngược là: %d", b, reversed);
      }
}
