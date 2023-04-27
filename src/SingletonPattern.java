public class SingletonPattern {

    public static <T> void show(Resource<T> r) {
        T val = r.get();
        System.out.println(val);
    }

    public static <T> void put(Resource<T> r, T val) {
        r.set(val);
    }
}
