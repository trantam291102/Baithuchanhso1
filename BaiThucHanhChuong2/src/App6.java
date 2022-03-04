import java.util.Scanner;
public class App6 {
    public static void main(String[] args) {
        int a,b=1;
        long GiaiThua=1;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("Nhập số nguyên dương bất kỳ: ");
                a=scanner.nextInt();
            } while ((a<=0));
        }
        while (b<=a) {
            GiaiThua*=b;
            b++;
        }    
        System.out.println(a + "! = " + GiaiThua);
    }
}
