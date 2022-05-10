import java.util.LinkedList;
import java.util.Scanner;
public class App111 {
    public static void main(String[] args){
        LinkedList<Integer> a = new LinkedList<>();
        int n, b, s = 0, d = 0;
        System.out.println("Nhap so phan tu: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++){
        b = sc.nextInt();
        if (b % 2 == 0){
            s += b;
            d++;
        }
        a.add(b);
        }
        System.out.println("Trung binh cong cua cac so chan la: " + s/d);
}
}