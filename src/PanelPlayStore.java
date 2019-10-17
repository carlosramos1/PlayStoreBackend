import javax.swing.*;
import java.awt.*;

public class PanelPlayStore extends JPanel {
    private JButton cerrarBtn;

    public PanelPlayStore() {
        setLayout(new FlowLayout());
        cerrarBtn = new JButton("cerrar Play Store");
        cerrarBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(cerrarBtn);
    }

    public JButton getCerrarBtn() {
        return cerrarBtn;
    }
}
