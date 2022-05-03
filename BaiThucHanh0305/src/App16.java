import java.util.ArrayList;
public class App16 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<String>();
        list1.add("Ha Noi");
        list1.add("Hai Phong");
        list1.add("Sai Gon");
        list1.add("Da Nang");
        list1.add("Can Tho");
        System.out.println("5 thanh pho thuoc truc trung uong cua nuoc ta la : ");
        for(int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}    

