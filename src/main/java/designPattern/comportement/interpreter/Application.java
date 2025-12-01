package designPattern.comportement.interpreter;

public class Application {
    public static void main(String[] args) {
        Expression expr = new AddExpression(new NumberExpression(3), new NumberExpression(7));
        System.out.println("Résultat: " + expr.interpret());
    }
}
