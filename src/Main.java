public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone();

        PhoneScreen phoneScreen = new PhoneScreen(phone);
        phoneScreen.setVisible(true);
    }
}
