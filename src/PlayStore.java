import java.util.HashMap;
import java.util.Map;

public class PlayStore implements App {
    private Map<String, App> apps;
    private Phone phone;

    public PlayStore(Phone phone) {
        apps = new HashMap<>();
        this.phone = phone;
        appsDisponibles();
    }

    private void appsDisponibles() {
        App youtube = new Youtube();
        apps.put(youtube.getName(), new Youtube());
        App facebook = new Facebook();
        apps.put(facebook.getName(), facebook);
    }

    public Map<String, App> getApps() {
        return apps;
    }

    public boolean appInstalled(String appName) {
        return phone.getInstalledApps().containsKey(appName);
    }

    public void installApp(String nameApp){
        phone.installApp(apps.get(nameApp));
    }

    @Override
    public String getName() {
        return "Play Store";
    }
}
