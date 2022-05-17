import java.util.HashSet;
import java.util.Scanner;
public class App56 {
    public static void main(String[] args) {
        String ten;
        HashSet<String> hashSetString=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        hashSetString.add("Honda");
        hashSetString.add("Yamaha");
        hashSetString.add("Thaco");
        hashSetString.add("Daewoo");
        hashSetString.add("Kia");
        hashSetString.add("Hyundai");
        hashSetString.add("Hyundai");
        System.out.println("Cac phan tu trong hashSetString: ");
        System.out.println(hashSetString);
        System.out.println("Nhap phan tu can xoa: ");
        ten=sc.nextLine();
        if(hashSetString.contains(ten)) {
            hashSetString.remove(ten);
            System.out.println("Xoa thanh cong: ");
            System.out.println("Cac phan tu con lai trong hashSetString: ");
            System.out.println(hashSetString);
        } else {
            System.out.println("Xoa khong thanh cong!");
        }
    }
}
