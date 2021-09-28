import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

class GsonTest {
    public static void main(String[] args) {
        String netInfo = "{\"IPv4\":\"10.0.2.15/24\",\"IPv6\":\"fe80::3054:1f65:ee6f:2e5d/64\",\"MAC\":\"08:00:27:D1:86:FF\"}";
        System.out.println(netInfo);
        Gson gson = new Gson();

        try {
            Map<String, Object> map = gson.fromJson(netInfo, Map.class);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}