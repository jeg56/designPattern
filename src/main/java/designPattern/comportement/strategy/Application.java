package designPattern.comportement.strategy;

public class Application {
    public static void main(String[] args) {
        Context context = new Context();

        System.out.println("Demande d'applcation stratégie 1 ");
        context.setStrategy(new StrategyImpl1());
        context.appliquerStrategy();
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

        System.out.println("Demande d'applcation stratégie 2 ");
        context.setStrategy(new StrategyImpl2());
        context.appliquerStrategy();
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

        System.out.println("Demande d'applcation stratégie 3 ");
        context.setStrategy(new StrategyImpl3());
        context.appliquerStrategy();
    }
}
