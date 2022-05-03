import java.util.ArrayList;
import java.util.ListIterator;
public class App19 {
    public static void main(String[] args) {
        ArrayList<Character> list4=new ArrayList<>();
        list4.add('m');
        list4.add('n');
        list4.add('o');
        list4.add('p');
        list4.add('q');
        ListIterator<Character> listIterator=list4.listIterator();
        System.out.println("Cac phan tu co trong list4 la : ");
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next()+"\t");
        }
    }
}
