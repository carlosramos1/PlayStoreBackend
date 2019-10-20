import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PanelPrincipal extends JPanel {
    private Map<String, JButton> appButtons;

    public PanelPrincipal() {
        appButtons = new HashMap<>();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    public void addAppButton(String nameApp){
        JButton button = new JButton(nameApp);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(button);
        appButtons.put(nameApp, button);
    }

    public JButton getAppButton(String nameApp){
        return appButtons.get(nameApp);
    }

}
