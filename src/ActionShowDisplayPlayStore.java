import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionShowDisplayPlayStore implements ActionListener {
    private  Pantalla pantalla;

    public ActionShowDisplayPlayStore(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(pantalla.getPlayStoreService().ok()) {
            pantalla.showPanelPlayStore();
            pantalla.hidePanelMain();
        }
    }
}
