public class Main {
    public static void main(String[] args) {
        Piatto p = new Piatto();
        Consumatore c = new Consumatore(p);
        Produttore pr = new Produttore(p);

        pr.start();
        c.start();
    }
}