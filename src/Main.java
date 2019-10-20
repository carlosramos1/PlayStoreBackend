public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.installApp(new PlayStore(phone));
        phone.installApp(new Youtube());

        PhoneScreen phoneScreen = new PhoneScreen(phone);
        phoneScreen.setVisible(true);
    }
}
