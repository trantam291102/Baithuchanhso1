package Baithuchanh1502.src;
import java.util.Scanner;
public class App40 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int ngay = scanner.nextInt();
            switch(ngay) {
                case 0:System.out.println("Thứ hai");
                break;
                case 1:System.out.println("Thứ ba");
                break;
                case 2:System.out.println("Thứ tư");
                break;
                case 3:System.out.println("Thứ năm");
                break;
                case 4:System.out.println("Thứ sáu");
                break;
                case 5:System.out.println("Thứ bảy");
                break;
                case 6:System.out.println("Chủ nhật");
                break;
                default:System.out.println("Đó không phải là ngày trong tuần");
            }
        }
    }        
}
   
