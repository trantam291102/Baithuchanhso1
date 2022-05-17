import java.util.LinkedHashMap;
import java.util.Set;
public class App95 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();
        linkedMap.put(1, "Java");
        linkedMap.put(2, "C++"); 
        linkedMap.put(3, "Swift");
        linkedMap.put(4, "Python");
        System.out.println("Before remove: ");
        show(linkedMap);
        linkedMap.remove(3);
        System.out.println("After remove: ");
        show(linkedMap);
        }
        public static void show(LinkedHashMap<Integer, String> linkedMap) {
        Set<Integer> keySet = linkedMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + linkedMap.get(key));
        }
    }
}