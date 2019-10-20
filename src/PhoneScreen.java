import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class PhoneScreen extends JFrame {
    private JMenuBar barraMenus;
    private JMenu menuFile;
    private JMenuItem menuItemClose;

    private PanelPrincipal panelMain;
    private Map<String, JPanel> appPanels;
    private Phone phone;

    public PhoneScreen(Phone celular) {
        this.phone = celular;
        this.appPanels = new HashMap<>();
        initGUI();
        Map<String, App> installedApps = phone.getInstalledApps();
        installedApps.forEach((appName, app) -> {
            panelMain.addAppButton(appName);
            switch (appName){
                case "Play Store":
                    PanelPlayStore panelPlayStore = new PanelPlayStore((PlayStoreService) app);
                    panelPlayStore.getButtonClose().addActionListener(new ActionClosePlayStore(this, app));
                    appPanels.put(appName, panelPlayStore);
                    panelMain.getAppButton(appName).addActionListener(new ActionShowDisplayPlayStore(this, app));
                    break;
            }
        });
    }

    private void initGUI() {
        setSize(320, 480);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        addMenuBar();

        panelMain = new PanelPrincipal();
        panelMain.setVisible(true);
        this.add(panelMain, BorderLayout.CENTER);

    }

    private void addMenuBar() {
        menuItemClose = new JMenuItem("Quit");
        menuItemClose.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){System.exit(0);}});
        menuFile = new JMenu("File");
        menuFile.add(menuItemClose);
        barraMenus = new JMenuBar();
        barraMenus.add(menuFile);
        this.setJMenuBar(barraMenus);
    }

    public void hidePanelMain() {
        panelMain.setVisible(false);
    }

    public void showPanelMain() {
        add(panelMain, BorderLayout.CENTER);
        panelMain.setVisible(true);
    }

    public void showPanelApp(String nameApp) {
        add(appPanels.get(nameApp), BorderLayout.CENTER);
        appPanels.get(nameApp).setVisible(true);
    }

    public void hidePanelApp(String nameApp) {
        appPanels.get(nameApp).setVisible(false);
    }

}
