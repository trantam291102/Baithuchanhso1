import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;
public class App68 {
  public static void main (String[] args) {
    int number;
    TreeSet<Integer> treeInt = new TreeSet<>();
    Scanner sc = new Scanner(System.in);
    treeInt.add(0);
    treeInt.add(3);
    treeInt.add(1);
    treeInt.add(4);
    treeInt.add(2);
    treeInt.add(8);
    System.out.println("Cac phan tu trong treeInt: ");
    System.out.println(treeInt);
    System.out.println("Nhap cac phan tu can them");
    number = sc.nextInt();
    if(!treeInt.contains(number)) {
      treeInt.add(number);
      System.out.println("Them thanh cong");
      System.out.println("Cac phan tu trong treeInt sau khi them: ");
      System.out.println(treeInt);
    } else {
      System.out.println("Phan tu " +number+ "da ton tai!" );
    }
  }
}