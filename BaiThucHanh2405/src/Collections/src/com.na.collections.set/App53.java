import java.util.HashSet;
import java.util.Scanner;
public class App53 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSetInt=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        hashSetInt.add(0);
        hashSetInt.add(1);
        hashSetInt.add(2);
        hashSetInt.add(3);
        hashSetInt.add(4);
        hashSetInt.add(5);
        System.out.println("Cac phan tu trong hashSetInt: ");
        System.out.println(hashSetInt);
        System.out.println("Nhap phan tu can them: ");
        number=sc.nextInt();
        if(!hashSetInt.contains(number)) {
            hashSetInt.add(number);
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu trong hashSetInt sau khi them: ");
            System.out.println(hashSetInt);
        } else {
            System.out.println("Phan tu "+number+" da ton tai!");
        }
    }
}