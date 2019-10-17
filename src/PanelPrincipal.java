import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private JButton playStoreButton;

    public PanelPrincipal() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        playStoreButton = new JButton("PlayStore");
        playStoreButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(playStoreButton);
    }

    public JButton getPlayStoreButton() {
        return playStoreButton;
    }
}
