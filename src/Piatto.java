import java.util.ArrayList;

public class Piatto {
    private final ArrayList<Integer> bocconi = new ArrayList<Integer>();
    private final int maxBocconi = 10;

    public synchronized void aggiungiBoccone(Integer b) throws InterruptedException {
        while (bocconi.size() == maxBocconi) {
            System.out.println("Piatto pieno! Il papà aspetta...");
            wait();
        }
        bocconi.add(b);
        System.out.println("Papà aggiunge il boccone: " + b);
        notifyAll();
    }

    public synchronized Integer mangiaBoccone() throws InterruptedException {
        while (bocconi.isEmpty()) {
            System.out.println("Piatto vuoto! Il bimbo aspetta...");
            wait();
        }
        Integer b = bocconi.remove(0);
        System.out.println("Il bimbo mangia il boccone: " + b);
        notifyAll();
        return b;
    }
}

