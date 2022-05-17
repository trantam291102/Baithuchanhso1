import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;
public class App69 {
    public static void main(String[] args) {
        int n;
        TreeSet<Integer> treeSetInt=new TreeSet<>();
        Scanner sc=new Scanner(System.in);
        treeSetInt.add(1);
        treeSetInt.add(2);
        treeSetInt.add(3);
        treeSetInt.add(4);
        treeSetInt.add(5);
        treeSetInt.add(6);
        System.out.println("Cac phan tu trong treeSetInt: ");
        System.out.println(treeSetInt);
        System.out.println("Nhap phan tu can them: ");
        n=sc.nextInt();
        if(!treeSetInt.contains(n)) {
            treeSetInt.add(n);
            System.out.println("Them thanh cong: ");
            System.out.println("Cac phan tu trong treeSetInt sau khi them: ");
            System.out.println(treeSetInt);
        } else {
            System.out.println("Phan tu "+n+" da ton tai");
        }
    }
}
