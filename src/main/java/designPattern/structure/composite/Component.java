package designPattern.structure.composite;

public abstract class Component {
    protected String name;
    protected int level;

    public Component(String name) {
        this.name= name;
    }

    public abstract void print();

    public int getLevel() {
        return level;
    }

}

