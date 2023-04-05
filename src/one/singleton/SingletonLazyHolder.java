package one.singleton;

/* 
 * Singleton "Lazy Holder"
 * @author barbarahellen
 */
public class SingletonLazyHolder {
    // encapsula a instância em uma classe estática interna

    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }

}
