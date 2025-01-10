public class Produttore extends Thread {
    private final Piatto piatto;
    private final Integer max;

    public Produttore (Piatto piatto) {
        this.piatto = piatto;
        this.max = 60;
    }

    @Override
    public void run(){
        Integer count = 1;
        Integer bocmax = 0;
        try {
            while (bocmax < max){
                piatto.aggiungiBoccone(count);
                count++;
                Thread.sleep(500);
                bocmax++;
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println("Produttore interrotto");
        }
    }
}
