import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        int x;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap vao so bat ky: ");
            x=sc.nextInt(); 
        }
        if(x%2==0){
            System.out.println("So vua nhap la so chan");
        }
        else {
            System.out.println("So vua nhap la so le");
        }
    }
}
