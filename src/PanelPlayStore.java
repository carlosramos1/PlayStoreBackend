import javax.swing.*;
import java.awt.*;

public class PanelPlayStore extends JPanel {
    private PlayStore playStore;

    public PanelPlayStore(PlayStore playStore) {
        this.playStore = playStore;
        setLayout(new GridLayout(15,1));

        this.playStore.getApps().forEach((appName, app)->{
            JPanel row = new JPanel();
            row.setLayout(new GridLayout(1,2));
            row.add(new JLabel(appName));
                JButton botonInstall = new JButton("instalar");
            row.add(botonInstall);
            this.add(row);
        });

    }

}
