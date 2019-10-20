import java.util.HashMap;
import java.util.Map;

public class PlayStore implements App {
    private Map<String, App> apps;

    public PlayStore() {
        apps = new HashMap<>();

        App youtube = new Youtube();
        apps.put(youtube.getName(), new Youtube());
        App facebook = new Facebook();
        apps.put(facebook.getName(), facebook);
    }

    public Map<String, App> getApps() {
        return apps;
    }

    @Override
    public String getName() {
        return "Play Store";
    }
}
