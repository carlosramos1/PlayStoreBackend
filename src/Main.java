public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.installApp(new PlayStore());
        phone.installApp(new Youtube());
        phone.installApp(new Facebook());

        PhoneScreen phoneScreen = new PhoneScreen(phone);
        phoneScreen.setVisible(true);
    }
}
