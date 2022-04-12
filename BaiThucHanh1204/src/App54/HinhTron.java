package App54;
import java.util.Scanner;
public class HinhTron extends HinhHoc{  
       public static HinhTron hinhTron;
    public float banKinh;
       public HinhTron() {
           ten="Hinh Tron";
       }
       public void nhapBanKinh() {
           System.out.println("Ban kinh = ");
           Scanner sc=new Scanner(System.in);
           banKinh=sc.nextFloat();
       }
       public void tinhChuVi() {
           chuVi=2*PI*banKinh;
       }
       public void tinhDienTich() {
           dienTich=PI*banKinh*banKinh;
       } 
}