package App1904;
import java.util.Scanner
public class Empolyee extends Person {
    protected String tenCongTyLamViec;
	protected int luong,gioLam;
	public Employee(String ten, long tuoi, String tenCongTyLamViec, int luong, int gioLamViec) {
		super(ten, tuoi);
		this.tenCongTyLamViec=tenCongTyLamViec;
		this.luong=luong;
		this.gioLam=gioLam;
	}
	public String getTenCongTyLamViec() {
		return tenCongTyLamViec;
	}
	public void setTenCongTyLamViec(String tenCongTyLamViec) {
		this.tenCongTyLamViec=tenCongTyLamViec;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong=luong;
	}
	public int getGioLamViec() {
		return gioLamViec;
	}
	public void setGioLam(int gioLamViec) {
		this.gioLamViec=gioLamviec;
	}
	public void nhapTenCongTyLamViec() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ten cong ty lam viec :");
		tenCuaHangLamViec=sc.nextLine();
	}
	public void nhapGioLam() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so gio lam viec :");
		gioLam=sc.nextInt();
	}
	public void tinhLuong() {
	}
	@Override
	public void inTenvaTuoi() {
		super.inTenvaTuoi();
		System.out.println("Ten cong ty lam viec :"+tenCongTyLamViec);
		System.out.println("So gio lam viec :"+gioLam);
	}
}
