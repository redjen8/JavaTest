import java.util.Scanner;

import com.google.gson.Gson;

class GsonTest {
    public static void main(String[] args) {
        // String netInfo =
        // "[{\"IPv4\":\"10.51.10.98/24\",\"IPv6\":\"fe80::e4ed:e9f1:b3be:abb7/64\",\"MAC\":\"30:9C:23:C2:6C:33\"},{\"IPv4\":\"192.168.56.1/24\",\"IPv6\":\"fe80::f528:e525:63f:899c/64\",\"MAC\":\"0A:00:27:00:00:28\"}]";
        // JSONArray jObject = new JSONArray(netInfo);
        // JSONObject oneObj = (JSONObject) jObject.get(1);
        // System.out.println(oneObj.getString("MAC"));
        // System.out.println(jObject.get(1).toString());
        Scanner sc = new Scanner(System.in);
        String json = sc.nextLine();
        MessageA msg = new Gson().fromJson(json, MessageA.class);
        System.out.println(msg);
        sc.close();
    }
}