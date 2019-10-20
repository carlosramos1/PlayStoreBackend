import java.util.HashMap;
import java.util.Map;

public class Phone {
    private Map<String, App> installedApps;

    public Phone() {
        installedApps = new HashMap<>();
    }

    public void installApp(App app) {
        installedApps.put(app.getName(), app);
    }

    public Map<String, App> getInstalledApps() {
        return installedApps;
    }
}
