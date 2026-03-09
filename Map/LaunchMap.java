import java.util.HashMap;
import java.util.LinkedHashMap;

public class LaunchMap {
    public static void main(String... args) {
        LinkedHashMap<Integer, String> hm1 = new LinkedHashMap<>();
        hm1.put(4, "Devansu");
        hm1.put(12, "Rana");
        hm1.put(120, "Ranaaa");
        hm1.put(1200, "Ranaa");
        System.out.print(hm1);
    }
}