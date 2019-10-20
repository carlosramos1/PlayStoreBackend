import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionShowDisplayApp implements ActionListener {
    private PhoneScreen phoneScreen;
    private App playStore;

    public ActionShowDisplayApp(PhoneScreen phoneScreen, App playStore) {
        this.phoneScreen = phoneScreen;
        this.playStore = playStore;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        phoneScreen.showPanelApp(playStore.getName());
        phoneScreen.hidePanelMain();
    }
}
