package designPattern.comportement.iterator;

public class Application {
    public static void main(String[] args) {
        Object[] data = {"A", "B", "C"};
        Iterator it = new ConcreteIterator(data);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
