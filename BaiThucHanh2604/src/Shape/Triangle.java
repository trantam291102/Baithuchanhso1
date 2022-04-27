package Shape;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Triangle extends Point {
    public float x1,y1,x2,y2,x3,y3;
    public float d12=sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    public float d23=sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
    public float d13=sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
    public String ten1,ten2,ten3;
    private float sqrt(float f) {
        return 0;
    }
    public Triangle(String ten, String ten1, String ten2, String ten3, float x, float y, float x1, float x2, float x3, float y1, float y2, float y3) {
        super(ten, x, y);
        this.x1=x1;this.x2=x2;this.x3=x3;
        this.y1=y1;this.y2=y2;this.y3=y3;
        this.ten1=ten1;this.ten2=ten2;this.ten3=ten3;
    }
    public Triangle() {
    }
    public String getTen1() {
		return ten1;
	}
	public void setTen1(String ten1) {
		this.ten1 = ten1;
	}
    public String getTen2() {
		return ten2;
	}
	public void setTen2(String ten2) {
		this.ten2 = ten2;
	}
    public String getTen3() {
		return ten3;
	}
	public void setTen3(String ten3) {
		this.ten3 = ten3;
	}
    public float getX1() {
		return x1;
	}
	public void setX1(float x1) {
		this.x1=x1;
	}
    public float getY1() {
		return y1;
	}
	public void setY1(float y1) {
		this.y1=y1;
	}
	public float getX2() {
		return x2;
	}
	public void setX2(float x2) {
		this.x2=x2;
	}
    public float getY2() {
		return y2;
	}
	public void setY2(float y2) {
		this.y2=y2;
	}
    public float getX3() {
		return x3;
	}
	public void setX3(float x3) {
		this.x3=x3;
	}
    public float getY3() {
		return y3;
	}
	public void setY3(float y3) {
		this.y3=y3;
	}
    public void nhapTenDiem1() {
		System.out.println("Nhap ten diem 1 :");
		Scanner sc=new Scanner(System.in);
		ten1=sc.nextLine();
	}
    public void nhapTenDiem2() {
		System.out.println("Nhap ten diem 2 :");
		Scanner sc=new Scanner(System.in);
		ten2=sc.nextLine();
	}
    public void nhapTenDiem3() {
		System.out.println("Nhap ten diem 3 :");
		Scanner sc=new Scanner(System.in);
		ten3=sc.nextLine();
	}
	public void nhapHoanhDo1() {
		System.out.println("Nhap hoanh do thu 1 :");
		Scanner sc= new Scanner(System.in);
		x1=sc.nextFloat();
	}
    public void nhapTungDo1() {
        System.out.println("Nhap tung do thu 1 :");
		Scanner sc=new Scanner(System.in);
		y1=sc.nextFloat();
    }
    public void nhapHoanhDo2() {
		System.out.println("Nhap hoanh do thu 2 :");
		Scanner sc= new Scanner(System.in);
		x2=sc.nextFloat();
	}
    public void nhapTungDo2() {
        System.out.println("Nhap tung do thu 2 :");
		Scanner sc=new Scanner(System.in);
		y2=sc.nextFloat();
    }
    public void nhapHoanhDo3() {
		System.out.println("Nhap hoanh do thu 3 :");
		Scanner sc= new Scanner(System.in);
		x3=sc.nextFloat();
	}
    public void nhapTungDo3() {
        System.out.println("Nhap tung do thu 3 :");
		Scanner sc=new Scanner(System.in);
		y3=sc.nextFloat();
    }
    public void XetTamGiac() {
        if((d12+d23<d13)||(d13+d23<d12)||(d12+d13<d23)) {
        if((d12*d12+d23*d23==d13*d13)||(d12*d12+d13*d13==d23*d23)||(d23*d23+d13*d13==d12*d12)) {
        if((d12==d23)||(d23==d13)||(d12==d13))
        {System.out.println("Do la tam giac vuong can");}
        else
        {System.out.println("Do la tam giac vuong");} }
        if((d12==d23)||(d23==d13)||(d12==d13)) {
        if((d12==d23)&&(d23==d13))
        {System.out.println("Do la tam giac deu");}
        else
        {System.out.println("Do la tam giac can");} }
        }
        {System.out.println("Do la 3 diem cua 1 tam giac");}
    }
}
