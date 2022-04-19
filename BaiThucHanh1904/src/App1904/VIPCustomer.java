package App1904;
import java.util.Scanner;
public class VIPCustomer extends Person{
    private String id;
	public VIPCustomer(String ten, long tuoi, String id,) {
		super(ten,tuoi);
		this.id=id;
	}
	public void nhapId() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap Id: ");
		id=sc.nextLine();
	}
	public void inTenvaTuoi() {
		super.inTenvaTuoi();
		System.out.println("Id: "+id);
	}
}