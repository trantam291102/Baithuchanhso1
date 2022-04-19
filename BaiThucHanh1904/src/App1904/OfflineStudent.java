package App1904;
import java.util.Scanner;
public class OfflineStudent extends Student {
    public String phuongTien;
	public OfflineStudent(String ten, long tuoi, String lop, double dtb, String phuongTienDiChuyen) {
		super(ten,tuoi,lop,dtb);
		this.phuongTien=phuongTien;
	}
	public String getPhuongTien() {
		return phuongTien;
	}
	public void setPhuongTien(String phuongTien) {
		this.phuongTien=phuongTien;
	}
	public void nhapPhuongTien() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap phuong tien di chuyen :");
		phuongTien=sc.nextLine();
	}
	@Override
	public String getLop() {
		return super.getLop();
	}
	@Override
	public void setLop(String lop) {
		super.setLop(lop);
	}
	@Override
	public double getDtb() {
		return super.getDtb();
	}
	@Override
	public void setDtb(double dtb) {
		super.setDtb(dtb);
	}
	@Override
	public void nhapLop() {
		super.nhapLop();
	}
	@Override
	public void nhapDtb() {
		super.nhapDtb();
	}
	@Override
	public void inTenvaTuoi() {
		super.inTenvaTuoi();
		System.out.println("Phuong tien di chuyen :"+phuongTien);
	}
}
