public class IntegerSingleton implements Resource<Integer> {

    private static IntegerSingleton value = new IntegerSingleton();

    private Integer i = Integer.valueOf(0);

    private IntegerSingleton() {
        System.out.println("IntegerSingleton()");
    }

    public static IntegerSingleton instance() {
        return value;
    }

    @Override public synchronized
    Integer get() { return i; }
    @Override public synchronized
    void set(Integer x) { i = x; }
}
