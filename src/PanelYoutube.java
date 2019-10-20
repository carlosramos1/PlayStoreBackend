import javax.swing.*;
import java.awt.*;

public class PanelYoutube extends JPanel {
    private Youtube youtube;

    public PanelYoutube(Youtube youtube){
        this.youtube = youtube;
        setLayout(new BorderLayout());
        setBackground(Color.red);
        add(new JLabel("You Tube"), BorderLayout.PAGE_START);
    }
}
