import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        float a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a:");
        a = (float)scanner.nextDouble();
        System.out.print("Nhập cạnh b:");
        b = (float)scanner.nextDouble();
        System.out.print("Nhập cạnh c:");
        c = (float)scanner.nextDouble();
        scanner.close();
        if ((a + b > c) || (a + c > b) || (b + c > a)) {
			System.out.println("Đây là tam giác !");
		}
		else if ((a == b) || (b == c) || (c == a)) {
			System.out.println("Đây là tam giác cân !");
		} else if ((a == b) && (b == c) && (c == a)) {
			System.out.println("Đây là tam giác đều !");
		} else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
			System.out.println("Đây là tam giác vuông !");
		} else {
			System.out.println("Đây không phải tam giác");
		}
    }
}
