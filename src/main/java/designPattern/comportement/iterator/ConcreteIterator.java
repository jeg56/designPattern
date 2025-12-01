package designPattern.comportement.iterator;

public class ConcreteIterator implements Iterator {
    private Object[] items;
    private int position = 0;
    public ConcreteIterator(Object[] items) { this.items = items; }
    public boolean hasNext() { return position < items.length; }
    public Object next() { return items[position++]; }
}
