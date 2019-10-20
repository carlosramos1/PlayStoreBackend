import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionShowDisplayPlayStore implements ActionListener {
    private PhoneScreen phoneScreen;
    private App playStore;

    public ActionShowDisplayPlayStore(PhoneScreen pantalla, App playStore) {
        this.phoneScreen = pantalla;
        this.playStore = playStore;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        phoneScreen.showPanelApp(playStore.getName());
        phoneScreen.hidePanelMain();
        System.out.println("mostrando play store");
    }
}
