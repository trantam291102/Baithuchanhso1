package App1904;
import java.util.Scanner;
public class Customer extends Person {
    private String id;
	public Customer(String ten, long tuoi, String id) {
		super(ten, tuoi);
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void nhapId() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap Id khach hang :");
		id=sc.nextLine();
	}
	@Override
	public void inTenvaTuoi() {
		super.inTenvaTuoi();
		System.out.println("Id: "+id);
	}
}
