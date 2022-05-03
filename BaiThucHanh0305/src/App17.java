import java.util.ArrayList;
public class App17 {
    public static void main(String[] args) {
        ArrayList<String> list2=new ArrayList<String>();
        list2.add("Nguyen Thanh Nam");
        list2.add("Tran Van Tuan");
        list2.add("Tran Thi My");
        list2.add("Bui Van Nhat");
        list2.add("Dang Quang Hieu");
        System.out.println("5 hoc sinh trong nhom la : ");
        for(String tinh:list2) {
            System.out.println(tinh+"\t");
        }
    }
}
