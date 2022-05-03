import java.util.ArrayList;
public class App21 {
    public static void main(String[] args) {
        ArrayList<String> list5=new ArrayList<String>();
        list5.add("Nga");
        list5.add("Canada");
        list5.add("Hoa Ky");
        list5.add("Trung Quoc");
        list5.add("Brazil");
        list5.add("Australia");
        list5.remove("Brazil");
        System.out.println(list5.get(2));
        System.out.println(list5.contains("Nga"));
        System.out.println(list5.contains("Viet Nam"));
        System.out.println(list5.size());
        System.out.println(list5);
    }
}
