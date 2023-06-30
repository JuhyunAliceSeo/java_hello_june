package java_0630;
class DBox<L, R> {
    private L left;
    private R right;

    public void set(L o, R r) {
        left = o;
        right = r;
    }

    @Override
    public String toString() {
        return left + " & " + right;
    }
}

class BoxFactory {
    public static <T> Box<T> makeBox(T o) {
        Box<T> box = new Box<T>();
        box.set(o);
        return box;
    }
}

public class _02_ {
    public static void main(String[] args) {
        DBox<String, Integer> box = new DBox<String, Integer>();
        box.set("apple", 25);
        System.out.println(box);

        Box<String> sBox = BoxFactory.makeBox("Sweet");
        System.out.println(sBox.get());

        Box<Double> dBox = BoxFactory.makeBox(7.59);
        System.out.println(dBox.get());

        Box<Integer> box1 = new Box<>();
        box1.set(99);   // 오토 박싱

        Box<Integer> box2 = new Box<>();
        box2.set(55);   // 오토 박싱

        System.out.println(box1.get() + " & " + box2.get());
        swapBox(box1, box2);
        System.out.println(box1.get() + " & " + box2.get());
    }

    public static <T> void swapBox(Box<T> box1, Box<T> box2) {
        T temp = box1.get();
        box1.set(box2.get());
        box2.set(temp);
    }
}