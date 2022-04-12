package App54;
import java.util.Scanner;
public class HinhVuong extends HinhChuNhat {
    public static HinhVuong hinhVuong;
    public float canh;
    public HinhVuong() {
        ten="Hinh Vuong";
    }
    public void nhapCanh() {
        System.out.println("Canh = ");
        Scanner sc=new Scanner(System.in);
        dai=rong=sc.nextFloat();
    }
}