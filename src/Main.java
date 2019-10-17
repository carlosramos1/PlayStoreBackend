public class Main {

    public static void main(String[] args) {
        PlayStoreService playStore = new PlayStoreService();
        Pantalla celular = new Pantalla(playStore);
        celular.setVisible(true);
    }
}
