import java.util.Scanner;
public class App3 {
    public static void main(String[] args) {
        int a;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhập tên của bạn: ");
            String yourname = sc.nextLine();
            System.out.println("Nhập tuổi của bạn: ");
            a=sc.nextInt();
            if(a<16){
                System.out.print("Bạn " +yourname);
                System.out.println(" ở độ tuổi vị thành niên");
            }
            else if(a>=18){
                System.out.print("Bạn " +yourname);
                System.out.println(" đã già");
            }
            else {
                System.out.print("Bạn " +yourname);
                System.out.println(" ở độ tuổi trưởng thành");
            }
        }
    }
}
