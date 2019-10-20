import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionClosePlayStore implements ActionListener {
    private PhoneScreen pantalla;
    private App app;

    public ActionClosePlayStore(PhoneScreen phoneScreen, App app) {
        this.pantalla = phoneScreen;
        this.app = app;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pantalla.showPanelMain();
        pantalla.hidePanelApp(app.getName());
       /* if(pantalla.getPlayStoreService().cerrarApp()) {
            pantalla.showPanelMain();
            pantalla.hidePanelPlayStore();
        }

        */
    }
}
