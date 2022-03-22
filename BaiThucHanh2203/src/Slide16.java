import java.util.Scanner;
public class Slide16 {
    public static void main(String[] args) throws Exception {
        HinhTron ht=new HinhTron();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();
    }  
}
class HinhTron {
    final float PI=3.14f;
    float r;
    float cv;
    float dt;
    void nhapBanKinh() {
        System.out.println("Hay nhap vao ban kinh hinh tron: ");
        Scanner sc=new Scanner(System.in);
        r=sc.nextFloat();
    }
    void tinhChuVi() {
        cv=2*PI*r;
    }
    void tinhDienTich() {
        dt=PI*r*r;
    }
    void inChuVi() {
        System.out.println("Chu vi Hinh tron: "+cv);
    }
    void inDienTich() {
        System.out.println("Dien tich Hinh tron: "+dt);
    }
}  