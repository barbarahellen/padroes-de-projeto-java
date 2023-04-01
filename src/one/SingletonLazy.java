package one;
/*
 * Singleton "preguiçoso"
 * @author barbarahellen
 */
public class SingletonLazy {
    // no primeiro momento não disponibiliza instância para o usuário
    
    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
