package designPattern.structure.composite;

public class Application {
    public static void main(String[] args) {
        Folder root = new Folder("/");

        root.addChild(new File("file1.txt"));
        root.addChild(new File("file2.txt"));

        Folder subFolder1 = new Folder("subfolder1");
        root.addChild(subFolder1);

        Folder subFolder2 = (Folder) subFolder1.addChild(new Folder("subfolder2"));
        subFolder2.addChild(new File("file3.txt"));
        subFolder2.addChild(new File("file4.txt"));
        root.print();
    }
}
