import javax.swing.*;
import java.awt.*;

public class PanelFacebook extends JPanel {
    private Facebook facebook;

    public PanelFacebook(Facebook facebook) {
        this.facebook = facebook;
        setLayout(new BorderLayout());
        setBackground(Color.BLUE);
        add(new JLabel("Facebook"), BorderLayout.PAGE_START);
    }

}
