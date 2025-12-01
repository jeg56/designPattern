package designPattern.structure.proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("Requête du vrai sujet");
    }
    @Override
    public String getData() {
        return "Données du vrai sujet";
    }

    @Override
    public Double calcule(Double a, Double b) {
        Double result = a + b;
        System.out.println( "Résultat depuis RealSubject : " + result);
        return result;
    }
}
