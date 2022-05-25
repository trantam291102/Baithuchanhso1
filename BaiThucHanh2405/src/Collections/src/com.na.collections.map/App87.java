import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class App87 {
    public static void main (String[] args) {
        HashMap<String,String> hashMapCity = new HashMap<>();
        hashMapCity.put("QNg", "Quang Ngai");
        hashMapCity.put("Qn", "Quang Nam");
        hashMapCity.put("Qn", "Quang Ninh");
        hashMapCity.put("HP", "Hai Phong");
        System.out.println("Danh sach cac thanh pho tronh hashMapCity: ");
        Set<Map.Entry<String,String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);
        System.out.println("QNg: " +hashMapCity.get("QNg"));
        System.out.println("NT: " +hashMapCity.get("NT"));
        if (hashMapCity.containsValue("Thanh pho Hai Phong")){
            System.out.println("Co Thanh pho Hai Phong trong hashMapCity");
        }
    }
}