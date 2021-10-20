import java.util.ArrayList;
import java.util.List;

class GenericType {
    public static <N> int cntGenericInArr(N[] list, N item) {
        int cnt = 0;
        for (N n: list) {
            if (item == n) {
                cnt++;
            }
        }
        return cnt;
    } 

    public List<? extends Number> method1() {
        return new ArrayList<Long>();
    }

    public <T> List <? extends String> method(T param) {
        return new ArrayList<String>();
    }

    public List<?> method3() {
        return new ArrayList<>();
    }
}