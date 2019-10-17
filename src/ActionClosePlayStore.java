import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionClosePlayStore implements ActionListener {
    private Pantalla pantalla;

    public ActionClosePlayStore(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(pantalla.getPlayStoreService().cerrarApp()) {
            pantalla.showPanelMain();
            pantalla.hidePanelPlayStore();
        }
    }
}
