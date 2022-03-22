import java.util.Date;
import java.util.Scanner;
public class SinhVien{
public static void main (String[] agrs){
    Scanner sc = new Scanner(System.in);
    sinhVien sv = new sinhVien();
    sv.NhapThongTin(sc);
    sv.HienThi();
}
}
class sinhVien{
    String MaSV;
    String HoTen;
    Boolean GioiTinh;
    String DiaChi;
    Date NgaySinh;
public void HienThi() {
    System.out.println("Id: " + MaSV);
    System.out.println("Ho ten: " + HoTen);
    System.out.println("Gioi tinh: " + GioiTinh);
    System.out.println("Dia chi: " + DiaChi);
    System.out.println("Ngay sinh: " + NgaySinh);   
}
public void NhapThongTin(Scanner sc) {
    System.out.println("Nhap id: ");
    MaSV = sc.nextLine();
    System.out.println("Nhap ho ten: ");
    sc.nextLine();
    HoTen= sc.nextLine();
    System.out.println("Nhap gioi tinh: ");
    GioiTinh = sc.nextBoolean();
    System.out.println("Nhap dia chi: ");
    DiaChi = sc.nextLine();
    System.out.println("Nhap ngay sinh: ");
}
}
