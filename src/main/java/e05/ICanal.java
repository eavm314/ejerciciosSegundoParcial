package e05;

public interface ICanal {
    void suscribir(ISuscriptor observer);
    void desuscribir(ISuscriptor observer);
    void notifyObservers(String commit);
}
