import java.util.HashSet;
import java.util.Scanner;
public class App54 {
    public static void main(String[] args) {
        int n;
        HashSet<Integer> hashSetInt=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        hashSetInt.add(1);
        hashSetInt.add(2);
        hashSetInt.add(3);
        hashSetInt.add(4);
        hashSetInt.add(5);
        hashSetInt.add(6);
        System.out.println("Cac phan tu trong hashSetInt: ");
        System.out.println(hashSetInt);
        System.out.println("Nhap phan tu can them: ");
        n=sc.nextInt();
        if(!hashSetInt.contains(n)) {
            hashSetInt.add(n);
            System.out.println("Them thanh cong: ");
            System.out.println("Cac phan tu trong hashSetInt sau khi them: ");
            System.out.println(hashSetInt);
        } else {
            System.out.println("Phan tu "+n+" da ton tai");
        }
    }
}