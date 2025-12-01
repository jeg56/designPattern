package designPattern.structure.proxy;

import java.text.SimpleDateFormat;
import java.util.HashMap;

public class Proxy implements Subject {
    private RealSubject realSubject;
    private HashMap <String, Double> cache = new HashMap<>();

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }
    @Override
    public void request() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        System.out.println("Proxy contrôle l'accès");
        System.out.println("Heure avant d'appeler la requête du vrai sujet: " + sdf.format(System.currentTimeMillis()));
        realSubject.request();
        System.out.println("Heure après avoir appelé la requête du vrai sujet: " +  sdf.format(System.currentTimeMillis()));
    }

    @Override
    public String getData() {
        return realSubject.getData() + " complété par le proxy";
    }

    @Override
    public Double calcule(Double a, Double b) {
        String key = a + "_" + b;
        if(cache.containsKey(key)) {
            System.out.println("Récupération du résultat depuis le cache pour les valeurs: " + a + ", " + b);
            return cache.get(key);
        }
        System.out.println("Calcul du résultat pour les valeurs: " + a + ", " + b);
        Double result = realSubject.calcule(a, b);
        cache.put(key, result);
        return result;

    }

}
