import java.util.Scanner;
public class Person{
public static void main (String[] agrs){
    Scanner sc = new Scanner(System.in);
    person p = new person();
    p.NhapThongTin(sc);
    p.HienThi();
}
}
class person{
    String PersonID;
    String PersonName;
    Boolean GioiTinh;
    String Address;
public void HienThi() {
    System.out.println("Id: " + PersonID);
    System.out.println("Ho ten: " + PersonName);
    System.out.println("Gioi tinh: " + GioiTinh);
    System.out.println("Dia chi: " + Address);  
}
public void NhapThongTin(Scanner sc) {
    System.out.println("Nhap id: ");
    PersonID = sc.nextLine();
    System.out.println("Nhap ho ten: ");
    PersonName= sc.nextLine();
    System.out.println("Nhap gioi tinh: ");
    GioiTinh = sc.nextBoolean();
    System.out.println("Nhap dia chi: ");
    Address = sc.nextLine();
}
}