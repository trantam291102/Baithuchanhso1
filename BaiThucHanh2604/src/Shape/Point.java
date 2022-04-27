package Shape;
import java.util.Scanner;
public class Point {
    public String ten;
    public float x,y;
    public Point(String ten, float x, float y) {
        this.ten=ten;
        this.x=x;
        this.y=y;
    }
    public Point() {
    }
    public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x=x;
	}
    public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y=y;
	}
    public void nhapTenDiem() {
		System.out.println("Nhap ten diem :");
		Scanner sc=new Scanner(System.in);
		ten=sc.nextLine();
	}
	public void nhapHoanhDo() {
		System.out.println("Nhap hoanh do :");
		Scanner sc= new Scanner(System.in);
		x=sc.nextFloat();
	}
    public void nhapTungDo() {
        System.out.println("Nhap tung do :");
		Scanner sc=new Scanner(System.in);
		y=sc.nextFloat();
    }
	public void inDiem() {
		System.out.println("Diem tren toa do Oxy la :"+ten+"("+x+","+y+")");
	}
}
