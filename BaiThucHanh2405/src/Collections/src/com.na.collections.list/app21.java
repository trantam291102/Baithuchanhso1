import java.util.ArrayList;
public class app21 {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<String>(3);
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Purple");
        colors.add("Pink");
        System.out.println(colors.get(2));
        System.out.println(colors.contains("Green"));
        System.out.println(colors.size());
        System.out.println(colors);
    }
}
