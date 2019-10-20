import javax.swing.*;
import java.awt.*;

public class PanelPlayStore extends JPanel implements IPanelApp {
    private JButton cerrarBtn;
    private PlayStoreService playStore;

    public PanelPlayStore(PlayStoreService playStore) {
        this.playStore = playStore;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        playStore.getApps().forEach((appName, app)->{
            JPanel row = new JPanel();
            row.setLayout(new GridLayout(1,2));
            row.add(new JLabel(appName));
                JButton botonInstall = new JButton("instalar");
                botonInstall.setAlignmentX(Component.CENTER_ALIGNMENT);
            row.add(botonInstall);
            this.add(row);
        });

        cerrarBtn = new JButton("cerrar Play Store");
        cerrarBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(cerrarBtn);
    }

    @Override
    public JButton getButtonClose() {
        return cerrarBtn;
    }
}
