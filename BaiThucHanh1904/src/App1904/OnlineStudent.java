package App1904;
import java.util.Scanner;
public class OnlineStudent extends Student {
    protected String phuongTienHoc;
	public OnlineStudent(String ten, long tuoi, String lop, double dtb, String phuongTienHoc) {
		super(ten,tuoi,lop,dtb);
		this.phuongTienHoc=phuongTienHoc;
	}
	public String getPhuongTienHoc() {
		return phuongTienHoc;
	}
	public void setPhuongTienHoc(String phuongTienHoc) {
		this.phuongTienHoc=phuongTienHoc;
	}
	public void nhapPhuongTienHoc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap phuong tien hoc online :");
		phuongTienHoc=sc.nextLine();
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
		System.out.println("Phuong tien hoc onl :"+phuongTienHoc);
	}
}
