import java.util.Scanner;
public class App5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            //khai báo biến a là số cần kiểm tra, sum là tổng các ước của a
            int sum = 0, a;
            System.out.println("\n\nNhập vào số cần kiểm tra: ");
            a = scanner.nextInt();
            for(int i=1;i<=a/2;i++){
              if(a%i==0) 
                //tổng các ước của a
                sum+=i;
            }
            if(sum==a){
              System.out.println(a + " là số hoàn thiện");
            }
            else {
              System.out.println(a + " không phải là số hoàn thiện");
            }
        }
    } 
}
