import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class App113 {
    public static void main(String[] args) {
        String Ten_Trai_Cay;
        int n;
        Scanner sc=new Scanner(System.in);
        HashSet<String> Trai_Cay=new HashSet<String>();
        System.out.println("Nhap so phan tu cua Trai_Cay: ");
        n=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten cac loai trai cay: ");
        for (int i=0;i<n;i++) {
            System.out.print("Nhap ten loai trai cay thu " +i+ ": ");
            Ten_Trai_Cay=sc.nextLine();
            Trai_Cay.add(Ten_Trai_Cay);
        }
        System.out.println("So phan tu cua Trai_Cay = " + Trai_Cay.size());
        System.out.println("Nhap ten loai trai cay can tim: ");
        String Tim_Trai_Cay=sc.nextLine();
        if (Trai_Cay.contains(Tim_Trai_Cay)) {
            System.out.println("Co trai cay " +Tim_Trai_Cay+ " trong Trai_Cay");
        } else {
            System.out.println("Khong tim thay " +Tim_Trai_Cay);
        }
        System.out.println("Nhap ten loai trai cay can xoa: ");
        String Xoa_Trai_Cay=sc.nextLine();
        if (Trai_Cay.contains(Xoa_Trai_Cay)) {
            Trai_Cay.remove(Tim_Trai_Cay);
            System.out.println("Xoa thanh cong");
            System.out.println("Cac phan tu con lai trong Trai_Cay: " +Trai_Cay);
        } else {
            System.out.println("Xoa khong thanh cong");
        }   
        ArrayList<String> DS_Trai_Cay=new ArrayList<>();
        DS_Trai_Cay.add("Tao");
        DS_Trai_Cay.add("Chuoi");
        DS_Trai_Cay.add("Xoai");
        DS_Trai_Cay.add("Cam");
        DS_Trai_Cay.add("Xoai");
        Trai_Cay.addAll(DS_Trai_Cay);
        System.out.println("Cac phan tu co trong Trai_Cay sau khi them: ");
        Iterator<String> iterator=Trai_Cay.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
        Trai_Cay.removeAll(DS_Trai_Cay);
        System.out.println("\nCac phan tu co trong Trai_Cay sau khi xoa: " +Trai_Cay);
        sc.close();
    }
}