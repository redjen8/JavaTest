import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.Map;
import org.json.*;

class GsonTest {
    public static void main(String[] args) {
        String netInfo = "[{\"IPv4\":\"10.51.10.98/24\",\"IPv6\":\"fe80::e4ed:e9f1:b3be:abb7/64\",\"MAC\":\"30:9C:23:C2:6C:33\"},{\"IPv4\":\"192.168.56.1/24\",\"IPv6\":\"fe80::f528:e525:63f:899c/64\",\"MAC\":\"0A:00:27:00:00:28\"}]";
        // System.out.println(netInfo);
        // netInfo = netInfo.substring(1, netInfo.length() - 1);
        // netInfo = netInfo.replaceAll("\"", "\\\"");
        // System.out.println(netInfo);
        // Gson gson = new Gson();

        // try {
        // Map<String, Object> map = gson.fromJson(netInfo, Map.class);
        // for (Map.Entry<String, Object> entry : map.entrySet()) {
        // System.out.println(entry.getKey() + "=" + entry.getValue());
        // }
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        JSONArray jObject = new JSONArray(netInfo);
        JSONObject oneObj = (JSONObject) jObject.get(1);
        System.out.println(oneObj.getString("MAC"));
        System.out.println(jObject.get(1).toString());
    }
}