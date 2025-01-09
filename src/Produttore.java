public class Produttore extends Thread {
    private final Piatto piatto;

    public Produttore (Piatto piatto) {
        this.piatto = piatto;
    }

    @Override
    public void run(){
        Integer count = 1;
        try {
            while (true){
                piatto.aggiungiBoccone(count);
                count++;
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println("Produttore interrotto");
        }
    }
}
