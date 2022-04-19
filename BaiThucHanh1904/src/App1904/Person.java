package App1904;
import java.util.Scanner;
public class Person {
    public String ten;
	public int tuoi;
	public Person(String ten, int tuoi) {
		this.ten=ten;
		this.tuoi=tuoi;
	}
	public void nhapTen() {
		System.out.println("Nhap ten cua ban :");
		Scanner sc=new Scanner(System.in);
		ten=sc.nextLine();
	}
	public void nhapTuoi() {
		System.out.println("Nhap tuoi cua ban :");
		Scanner sc= new Scanner(System.in);
		tuoi=sc.nextInt();
	}
    public void nhapGioiTinh() {
        System.out.println("Nhap gioi tinh cua ban :");
		Scanner sc=new Scanner(System.in);
		gender=sc.nextLine();
    }
	public void inTenvaTuoi() {
		System.out.println("Ten cua ban la :"+ten);
		System.out.println("Tuoi cua ban la :"+tuoi);
	}
}
