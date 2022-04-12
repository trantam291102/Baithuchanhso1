package App77;
import java.util.Scanner;
public class HinhTron {
    protected float bk;
	private Scanner sc;
	public HinhTron() {
		super();
		sc=new Scanner(System.in);
	}
	public void nhapBanKinh() {
		System.out.println("Ban dung don vi nao:");
		System.out.println("1.Cm");
		System.out.println("2.inch");
		Configs.donvi=sc.nextInt();
		System.out.println("Nhap vao ban kinh: ");
		bk=sc.nextFloat();
		
	}
	public void inThongTin() {
		if(Configs.donvi == Configs.DON_VI_CM) {
			System.out.println("Hinh tron co ban kinh "+bk+" cm");
			System.out.println("Tuong duong voi "+Configs.ChuyenCentimetSangInch(bk)+" inch");
		}
		else {
			System.out.println("Hinh tron co ban kinh "+bk+" inch");
			System.out.println("Tuong duong voi "+Configs.ChuyenInchSangCentimet(bk)+" cm");
		}
	}
}
