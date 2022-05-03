import java.util.ArrayList;
import java.util.Iterator;
public class App18 {
    public static void main(String[] args) {
        ArrayList<Float> list3=new ArrayList<>();
        list3.add(81f);
        list3.add(243f);
        list3.add(729f);
        list3.add(2187f);
        list3.add(6561f);
        Iterator<Float> iterator=list3.iterator();
        System.out.println("Cac phan tu co trong list3 la : ");
        while(iterator.hasNext()) {
            System.out.println(iterator.next()+"\t");
        }
    }
}
