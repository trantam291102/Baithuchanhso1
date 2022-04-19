package App1904;
import java.util.Scanner;
public class Student extends Person{
    public String lop;
	public double dtb;
	public Student(String ten, long tuoi, String lop, double dtb) {
		super(ten,tuoi);
		this.lop=lop;
		this.dtb=dtb;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public double getDtb() {
		return dtb;
	}
	public void setDtb(double dtb) {
		this.dtb=dtb;
	}
	public void nhapLop() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ten lop cua ban: ");
		lop=sc.nextLine();
	}
	public void nhapDtb() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap dtb: ");
		dtb=sc.nextDouble();
	}
	@Override
	public void inTenvaTuoi() {
		super.inTenvaTuoi();
		System.out.println("ten lop: "+lop);
		System.out.println("Diem trung binh: "+dtb);
	}
}
