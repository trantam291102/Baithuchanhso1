import java.util.Scanner;
public class App3 {
    public static void main(String[] args) {
        int a;
        boolean isPrime=true;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap vao so cần kiểm tra:");
        int b=scanner.nextInt();
        scanner.close();
        for(int i=2;i<=b/2;i++)
        {
            a=b%i;
            if(a==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            System.out.println(b + " Là số nguyên tố!");
        else
            System.out.println(b + " Không phải là số nguyên tố!");
    }
}
