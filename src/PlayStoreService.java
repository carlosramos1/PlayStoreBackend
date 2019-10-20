import java.util.HashMap;
import java.util.Map;

public class PlayStoreService implements App {
    private Map<String, App> apps;

    public PlayStoreService() {
        apps = new HashMap<>();

        App youtube = new Youtube();
        apps.put(youtube.getName(), new Youtube());
        App facebook = new Facebook();
        apps.put(facebook.getName(), facebook);
    }

    public boolean ok(){
        System.out.println("play Store OK");
        return true;
    }

    public boolean cerrarApp(){
        System.out.println("Play Store Close");
        return true;
    }

    public Map<String, App> getApps() {
        return apps;
    }

    @Override
    public String getName() {
        return "Play Store";
    }
}
