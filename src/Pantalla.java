import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pantalla extends JFrame {
    private JMenuBar barraMenus;
    private JMenu menuFile;
    private JMenuItem menuItemClose;

    private PanelPrincipal panelMain;
    private PanelPlayStore panelPlayStore;

    private PlayStoreService playStoreService;

    public Pantalla(PlayStoreService playStore){
        this.playStoreService = playStore;
        setSize(320, 480);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        addMenuBar();

        panelMain = new PanelPrincipal();
        panelMain.setVisible(true);
        panelPlayStore = new PanelPlayStore();
        panelPlayStore.setVisible(false);

        this.add(panelMain, BorderLayout.CENTER);

        panelMain.getPlayStoreButton().addActionListener(new ActionShowDisplayPlayStore(this));
        panelPlayStore.getCerrarBtn().addActionListener(new ActionClosePlayStore(this));
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

    public void showPanelPlayStore() {
        add(panelPlayStore, BorderLayout.CENTER);
        panelPlayStore.setVisible(true);
    }

    public void hidePanelMain() {
        panelMain.setVisible(false);
    }

    public void showPanelMain() {
        add(panelMain, BorderLayout.CENTER);
        panelMain.setVisible(true);
    }

    public void hidePanelPlayStore() {
        panelPlayStore.setVisible(false);
    }

    public PlayStoreService getPlayStoreService() {
        return playStoreService;
    }
}
