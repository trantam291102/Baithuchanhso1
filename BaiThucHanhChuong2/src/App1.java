import java.util.Scanner;
public class App1 {
    public static void main(String[] args) {
        int x,y;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhập vào số thứ nhất: ");
            x=sc.nextInt();
            System.out.println("Nhập vào số thứ hai: ");
            y=sc.nextInt(); 
        }
        System.out.println("Tổng của hai số vừa nhập là: "+(x+y));
        System.out.println("Hiệu của hai số vừa nhập là: "+(x-y));
        System.out.println("Tích của hai số vừa nhập là: "+(x*y));
        System.out.println("Thương của hai số vừa nhập là: "+(float)x/y);
        System.out.println("Số dư của thương của hai số vừa nhập là: "+(x%y));
        if(x>y){
            System.out.println("Số thứ nhất lớn hơn số thứ hai");
        }
        else if(x<y){
            System.out.println("Số thứ nhất nhỏ hơn số thứ hai");
        }
        else {
            System.out.println("Số thứ nhất bằng số thứ hai");
        }
    }
}
