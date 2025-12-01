package designPattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    private List<Component> children= new ArrayList<>();

    public Folder(String name) {
        super(name);
    }
    @Override
    public void print() {
        System.out.println("Folder :" + "      ".repeat(getLevel()) + "|" + name +" (level="+ getLevel() +")");
        for (Component c : children) {
            c.print();
        }
    }

    public Component addChild(Component children) {
        children.level= this.level + 1;
        this.children.add(children);
        return children;
    }
}
