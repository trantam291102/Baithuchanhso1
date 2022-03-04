import java.util.Scanner;
public class App10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String chuoi;
                char kitu;
                int count=0;
                do 
                {
                    System.out.println("nhập 1 chuỗi : ");
                    chuoi=sc.nextLine();
                }
                while(chuoi.length()>80);
                System.out.println("nhập 1 kí tự: ");
                kitu=sc.next().charAt(0);
                char mang[]=chuoi.toCharArray();
                for(int i=0;i<mang.length;i++)
                {
                    if(mang[i]==kitu)
                    {
                        count++;
                    }
                }
                System.out.println("có "+count+" kí tự "+kitu+" trong chuỗi vừa nhập");
            }
        }
}
