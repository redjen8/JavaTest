package ShareMemoryTest;

import java.util.ArrayList;
import java.util.List;

public class ShareMemoryTest {

    List<String> eachList;
    List<String> commonList = new ArrayList<String>();

    public void eachListTest1() {
        eachList = new ArrayList<String>();
        eachList.add("first1");
        eachList.add("second1");
        commonList.add("common11");
        commonList.add("common12");
        for (int i = 0; i < eachList.size(); i++) {
            System.out.println(eachList.get(i));
        }
        for (int i = 0; i < commonList.size(); i++) {
            System.out.println(commonList.get(i));
        }
    }

    public void eachListTest2() {
        eachList = new ArrayList<String>();
        eachList.add("first2");
        eachList.add("second2");
        commonList.add("common21");
        commonList.add("common22");
        for (int i = 0; i < eachList.size(); i++) {
            System.out.println(eachList.get(i));
        }
        for (int i = 0; i < commonList.size(); i++) {
            System.out.println(commonList.get(i));
        }
    }
}