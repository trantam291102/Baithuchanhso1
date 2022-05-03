import java.util.ArrayList;
import java.util.Scanner;
public class App22 {
    public static void main(String[] args) {
        ArrayList<Integer> list6=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Nhap so phan tu cua list6 : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.print("Nhap phan tu thu"+ i +": ");
            number=sc.nextInt();
            list6.add(number);
        }
        int max=list6.get(0);
        for(int i=0;i<list6.size();i++) {
            if(list6.get(i).compareTo(max)>0) {
                max=list6.get(i);
            }
        }
        System.out.print("Phan tu lon nhat trong list6 ="+ max);
    }
}