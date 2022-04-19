package App1904;
import java.util.Scanner;
public class PartTimeEmployee extends Employee {
    private int soNgayLamViec;
	public PartTimeEmployee(String ten, long tuoi, String tenCongTyLamViec, int luong, int gioLamViec, int soNgayLamViec) {
		super(ten,tuoi,tenCongTyLamViec,luong,gioLamViec);
		this.soNgayLamViec=soNgayLamViec;
	}
	public int getSoNgayLamViec() {
		return soNgayLamViec;
	}
	public void setSoNgayLamViec(int soNgayLamViec) {
		this.soNgayLamViec=soNgayLamViec;
	}
	public void nhapSoNgayLamViec()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so ngay lam viec moi ngay :");
		soNgayLamViec=sc.nextInt();
	}
	@Override
	public void tinhLuong() {
		luong=gioLamViec*30000*soNgayLamViec;
	}
	@Override
	public void inTenvaTuoi() {
		super.inTenvaTuoi();
		System.out.println("Luong :"+luong+"VND");
	};
}
