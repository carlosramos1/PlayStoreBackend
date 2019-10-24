import javax.swing.*;
import java.awt.*;

public class PanelPlayStore extends JPanel {
    private PlayStore playStore;

    public PanelPlayStore(PlayStore playStore) {
        this.playStore = playStore;
        setLayout(new GridLayout(15,1));
        refreshButtonsPanel();
    }

    public void refreshButtonsPanel() {
        removeAll();
        this.playStore.getApps().forEach((appName, app)->{
            JPanel row = new JPanel();
            row.setLayout(new GridLayout(1,2));
            row.add(new JLabel(appName));
            if(playStore.appInstalled(appName)){
                JButton botonDesinstalar = new JButton("Desinstalar");
                botonDesinstalar.addActionListener(new ActionDesinstalarApp(playStore, appName, this));
                row.add(botonDesinstalar);
            }
            else {
                JButton buttonInstalar = new JButton("Instalar");
                buttonInstalar.addActionListener(new ActionInstalarApp(playStore, appName, this));
                row.add(buttonInstalar);
            }
            this.add(row);
        });
        revalidate();
        repaint();
    }
}
