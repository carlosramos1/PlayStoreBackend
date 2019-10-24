import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionDesinstalarApp implements ActionListener {
    private PlayStore playStore;
    private String appName;
    private PanelPlayStore panelPlayStore;

    public ActionDesinstalarApp(PlayStore playStore, String appName, PanelPlayStore panelPlayStore) {
        this.playStore = playStore;
        this.appName = appName;
        this.panelPlayStore = panelPlayStore;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        playStore.uninstallApp(appName);
        panelPlayStore.refreshButtonsPanel();
    }
}
