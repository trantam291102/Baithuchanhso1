import java.util.Scanner;
public class PhuongTrinhBac2 {
    public static void main(String[] args) throws Exception {
        PTB2 ptb2=new PTB2();
        ptb2.nhapHeSoa();
        ptb2.nhapHeSob();
        ptb2.nhapHeSoc();
        ptb2.inKetQua();
    }  
}
class PTB2 {
    float a,b,c,x1,x2;
    void nhapHeSoa() {
        System.out.println("Hay nhap he so a: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
    }
    void nhapHeSob() {
        System.out.println("Hay nhap he so b: ");
        Scanner sc=new Scanner(System.in);
        b=sc.nextFloat();
    }
    void nhapHeSoc() {
        System.out.println("Hay nhap he so c: ");
        Scanner sc=new Scanner(System.in);
        c=sc.nextFloat();
    }
    void inKetQua() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "+ "x = " + (-c / b));          
            }
        }
        float delta=b*b-4*a*c;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh co 2 nghiem la: "+ "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep: "+ "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
