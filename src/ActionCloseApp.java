import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionCloseApp implements ActionListener {
    private PhoneScreen phoneScreen;

    public ActionCloseApp(PhoneScreen phoneScreen) {
        this.phoneScreen = phoneScreen;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        phoneScreen.hidePanelApp(phoneScreen.getPanelActual());
        phoneScreen.showPanelMain();
        System.out.println("cerrando "+phoneScreen.getPanelActual());
    }
}
