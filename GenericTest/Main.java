import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            intArr.add(i+1);
            System.out.print(i + " ");
            System.out.println(GenericType.cntGenericInArr(intArr.toArray(), i));
        }
        intArr.add(3);
        System.out.print(3 + " ");
        System.out.println(GenericType.cntGenericInArr(intArr.toArray(), 3));
    }
}