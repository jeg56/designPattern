package designPattern.structure.proxy;

public class Application {
    public static void main(String[] args) {

        Subject proxy = new Proxy(new RealSubject());

        proxy.request();
        System.out.println("------------------------------------------");
        System.out.println(proxy.getData());
        System.out.println("------------------------------------------");
        System.out.println(proxy.calcule(1.0, 2.0));
        System.out.println("------------------------------------------");
        System.out.println(proxy.calcule(1.0, 3.0));
        System.out.println("------------------------------------------");
        System.out.println(proxy.calcule(1.0, 2.0));
    }
}
