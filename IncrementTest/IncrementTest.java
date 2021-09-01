
class IncrementTest {
    public static void main(String[] args) {
        int i = 2;
        int j = (++i);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        i = 2;
        j = 3;
        j = (++i) + (i++);

        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}