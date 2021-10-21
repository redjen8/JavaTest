import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    
    public static void main (String[] args) {
        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member("오윤희", 24, "123456-1158712", "010-1234-5678"));
        memberList.add(new Member("나애교", 21, "928316-1212447", "010-1412-5794"));
        memberList.add(new Member("천서진", 23, "988626-1689122", "010-6162-5120"));
        memberList.add(new Member("주단태", 20, "782916-2149901", "010-7984-1248"));

        Map<String, Member> memberMap = memberList.stream()
        .collect(Collectors.toMap(Member::getName, Function.identity()));
        
        System.out.println("::: 전체 출력 :::\n");
        for (Map.Entry<String, Member> element : memberMap.entrySet()) {
            System.out.println(element.getKey() + " : " + element.getValue().getAge()  + ", " + element.getValue().getSocialId() + ", " + element.getValue().getPhoneNumber());
        }

        memberMap = memberList.stream()
        .filter(member -> member.getAge() > 22)
        .collect(Collectors.toMap(Member::getName, Function.identity()));

        System.out.println("\n::: getAge로 filter :::\n");
        for (Map.Entry<String, Member> element : memberMap.entrySet()) {
            System.out.println(element.getKey() + " : " + element.getValue().getAge()  + ", " + element.getValue().getSocialId() + ", " + element.getValue().getPhoneNumber());
        }

        Member exactMember = memberList.parallelStream()
        .filter(p -> p.getPhoneNumber() == "010-7984-1248")
        .findAny().get();

        System.out.println("\n::: parallelStream로 filter :::\n");
        System.out.println(exactMember.getName() + " : " + exactMember.getAge()  + ", " + exactMember.getSocialId() + ", " + exactMember.getPhoneNumber());

    }
}
