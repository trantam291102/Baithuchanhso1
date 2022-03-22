import java.util.Scanner;
public class HinhChuNhat {
    public static void main(String[] args) throws Exception {
        hinhChuNhat hcn=new hinhChuNhat();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();
    }  
}
class hinhChuNhat {
    float a,b;
    float cv;
    float dt;
    void nhapChieuDai() {
        System.out.println("Hay nhap vao chieu dai hinh chu nhat: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
    }
    void nhapChieuRong() {
        System.out.println("Hay nhap vao chieu rong hinh chu nhat: ");
        Scanner sc=new Scanner(System.in);
        b=sc.nextFloat();
    }
    void tinhChuVi() {
        cv=2*a+2*b;
    }
    void tinhDienTich() {
        dt=a*b;
    }
    void inChuVi() {
        System.out.println("Chu vi Hinh chu nhat: "+cv);
    }
    void inDienTich() {
        System.out.println("Dien tich Hinh chu nhat: "+dt);
    }
}
