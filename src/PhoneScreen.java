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
    private JButton btnCloseApp;

    private PanelPrincipal panelMain;
    private Map<String, JPanel> appPanels;
    private Phone phone;
    private String panelActual;

    public PhoneScreen(Phone celular) {
        this.phone = celular;
        this.appPanels = new HashMap<>();
        initGUI();

        actualizarBotonesAppInstalados();

        btnCloseApp = new JButton("Cerrar App");
        btnCloseApp.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnCloseApp.addActionListener(new ActionCloseApp(this));
        add(btnCloseApp, BorderLayout.PAGE_END);
    }

    private void actualizarBotonesAppInstalados() {
        panelMain.removeAll();
        phone.getInstalledApps().forEach((appName, app) -> {
            panelMain.addAppButton(appName);
            panelMain.getAppButton(appName).addActionListener(new ActionShowDisplayApp(this, app));
            switch (appName){
                case "Play Store":
                    appPanels.put(appName, new PanelPlayStore((PlayStore) app));
                    break;
                case "Youtube":
                    appPanels.put(appName, new PanelYoutube((Youtube) app));
                    break;
                case "Facebook":
                    appPanels.put(appName, new PanelFacebook((Facebook) app));
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
        //panelMain.setVisible(true);
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

    public void showPanelMain() {
        add(panelMain, BorderLayout.CENTER);
        actualizarBotonesAppInstalados();
        updateMenuBar(true);
        revalidate();
        repaint();
    }

    public void hidePanelMain() {
        remove(panelMain);
        revalidate();
        repaint();
    }

    public void showPanelApp(String nameApp) {
        add(appPanels.get(nameApp), BorderLayout.CENTER);
        panelActual = nameApp;
        updateMenuBar(false);
        revalidate();
        repaint();
    }

    public void hidePanelApp(String nameApp) {
        try {
            remove(appPanels.get(nameApp));
        }catch (NullPointerException e){  }
        add(panelMain, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public String getPanelActual() {
        return panelActual;
    }

    public void updateMenuBar(boolean isPanelMain){
        menuItemClose.removeActionListener(menuItemClose.getActionListeners()[0]);
        if(isPanelMain){
            menuItemClose.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){System.exit(0);}});
        }else{
            menuItemClose.addActionListener(new ActionCloseApp(this));
        }
    }
}
