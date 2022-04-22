package cases.utils;

public class CheckPoint {
    public static void trigger(int i, int id) {
        System.out.printf("%d:%d\n", i, id);
    }
    public static void trigger(int i, Object id) {
        System.out.printf("%d:%s\n", i, id.toString());
    }
}
