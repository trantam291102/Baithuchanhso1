import java.util.Map;
import java.util.LinkedHashMap;
public class App94 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hn=new LinkedHashMap<Integer,String>();
        hn.put(100,"Mo");
        hn.put(101,"Dia");
        hn.put(102,"Chat");
        for(Map.Entry<Integer,String>n:hn.entrySet())
        System.out.println(n.getKey()+" "+n.getValue());
        System.out.println("Before invoking remove method: " +hn);
        hn.remove(101);    
        System.out.println("After invoking remove method: " +hn);
    }
}
