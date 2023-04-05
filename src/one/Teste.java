package one;

import one.facade.Facade;
import one.singleton.*;
import one.strategy.*;

public class Teste {
    public static void main(String[] args) {

        // Testes relacionados ao Design Pattern Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(singletonLazyHolder);
        singletonLazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(singletonLazyHolder);


        // Testes relacionados ao Design Pattern Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setcomportamento(normal);
        robo.mover();
        robo.mover();

        robo.setcomportamento(defensivo);
        robo.mover();
        
        robo.setcomportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();


        // Testes relacionados ao Design Pattern Facade

        Facade facade = new Facade();
        facade.migrar("venilton", "14700788");

        
    }
}
