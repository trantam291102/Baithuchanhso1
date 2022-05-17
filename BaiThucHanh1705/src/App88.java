import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class App88 {
    public static void main(String[] args) {
        HashMap<String, String> hasMapCity = new HashMap<>();
        hasMapCity.put("QNa", "Quang Nam");
        hasMapCity.put("QNi", "Quang Ninh");
        hasMapCity.put("HP", "Hai Phong");
        hasMapCity.put("NA", "Nghe An");
        System.out.println("Danh sach cac thanh pho trong hasMapCity: ");
        Set<Map.Entry<String, String>> setCity = hasMapCity.entrySet();
        System.out.println(setCity);
        System.out.println("QNa" + hasMapCity.get("QNa"));
        System.out.println("HCM" + hasMapCity.get("HCM"));
        if (hasMapCity.containsValue("Hai Phong"));
        System.out.println("Co thanh pho Hai Phong trong hasMapCity");
    }
}
