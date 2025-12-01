package designPattern.structure.composite;

public class File extends Component {

    public File(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("File   :" + "      ".repeat(getLevel()-1) +" ->"+ name+" (level="+ getLevel() +")");
    }
}
