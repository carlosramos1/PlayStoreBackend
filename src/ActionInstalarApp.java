import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionInstalarApp implements ActionListener {
    private PlayStore playStore;
    private String appName;
    private PanelPlayStore panelPlayStore;

    public ActionInstalarApp(PlayStore playStore, String appName, PanelPlayStore panelPlayStore) {
        this.playStore = playStore;
        this.appName = appName;
        this.panelPlayStore = panelPlayStore;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        playStore.installApp(appName);
        panelPlayStore.refreshButtonsPanel();
    }
}
