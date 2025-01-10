public class Consumatore extends Thread {
    private final Piatto piatto;

    public Consumatore(Piatto piatto){
        this.piatto = piatto;
    }

    @Override
    public void run(){
        try{
            while (true){
                    piatto.mangiaBoccone();
                    Thread.sleep(1000);
            }
        }catch (Exception e){
            Thread.currentThread().interrupt();
            System.out.println("Consumatore interrotto");
        }
    }
}
