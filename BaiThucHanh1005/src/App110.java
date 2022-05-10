import java.util.ArrayList;
import java.util.Scanner;
public class App110 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInt = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number; 
        System.out.println("Nhap so phan tu cua ArrayList: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i +": ");
            number = sc.nextInt();
            arrListInt.add(number);
        }
        int max = arrListInt.get(0);    
        for (int i = 1; i < arrListInt.size(); i++) {
            if (arrListInt.get(i).compareTo(max) > 0) {
                max = arrListInt.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong arrListInt = " + max);
    }
}
