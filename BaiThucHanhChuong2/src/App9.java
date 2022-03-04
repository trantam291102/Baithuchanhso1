import java.util.Scanner;
public class App9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("nhập 1 chuỗi bất kì: ");
            String chuoi=sc.nextLine();
            int demso=0,demchuhoa=0,demchuthuong=0;
            System.out.println(" chuỗi vừa nhập là: "+chuoi);
            int length=chuoi.length();
            for(int i=0;i<length;i++)
            	{
            		if(Character.isUpperCase(chuoi.charAt(i)))
            		{
            			demchuhoa++;
            		}
            		if(Character.isLowerCase(chuoi.charAt(i)))
            		{
            			demchuthuong++;
            		}
            		if(Character.isDigit(chuoi.charAt(i)))
            		{
            			demso++;
            		}
            	}
            int kitukhac=length-demchuhoa-demchuthuong-demso;
            System.out.println("có "+demchuhoa+" kí tự in hoa");
            System.out.println("có "+demchuthuong+" kí tự chữ thường");
            System.out.println("có "+demso+" kí tự số");
            System.out.println("có "+kitukhac+" kí tự khác");
        }
    }
}
