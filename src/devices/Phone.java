package devices;

import com.company.Application;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Phone extends Device {
    static String uribase = "https://www.applications.server/v1.0";
    static final URI serverUriAddress = URI.create(uribase);
    private ArrayList<Application> apps = new ArrayList<>();

    @Override
    public void turnOn() {
        System.out.println("Telefon ma metodę włącz");
    }

    public boolean InstallAnnApp(String appName) {
        StringBuilder sb = new StringBuilder();
        sb = new StringBuilder(appName + appName);
        System.out.println(sb);
        return true;
    }

    public boolean InstallAnnApp(String appName, String version) {
        StringBuilder sb = new StringBuilder();
        sb = new StringBuilder(appName + appName);
        System.out.println(sb);
        sb.append(version);
        System.out.println(sb);
        return true;
    }

    public void InstallAnnApp(String appName, String version, String serverAddress) {
        StringBuilder sb = new StringBuilder();
        sb.append(appName);
        sb.append(version);
        sb.append(serverAddress);
        System.out.println(sb);
    }

    public boolean InstallAnnApp(String[] appName) {
        for (int i=0;i<appName.length;i++)
        {
            System.out.println(appName[i]);
            if (i == 3)
                return true;
        }
        return false;
    }

    public boolean installAnnApp(URI uriAppName) {
        return uriAppName.isAbsolute();
    }

    public double installAnApp(double moneys, double appVersion, String appName, double appPrice) {
        var application = new Application();
        application.appVersion = appVersion;
        application.appName = appName;
        application.appPrice = appPrice;

        if (application.appPrice > moneys) {
            System.out.println("Nie masz niestety tyle pieniędzy :(");
            return moneys;
        } else {
            this.apps.add(application);
            System.out.println("Gratulujemy! Aplikacja została przez Ciebie zakupiona");
            return moneys - application.appPrice;
        }
    }

    public void isAppInstalled(Application appName) {
        for (int i=0;i<apps.size();i++) {
            if (apps.get(i).appName.equals(appName.appName)) {
                System.out.println("Tak, aplikacja jest zainstalowana");
            }
        }
    }

    public boolean isAppInstalled(String appName) {
        for (int i=0;i<apps.size();i++) {
            if (apps.get(i).appName.equals(appName)) {
                System.out.println("Tak, aplikacja jest zainstalowana");
                return true;
            }
        }
        System.out.println("Tak, aplikacja jest zainstalowana");
        return false;
    }

    public void getAllFreeApps() {
        for (int i=0;i<apps.size();i++) {

            if (apps.get(i).appPrice == 0) {
                System.out.println(apps.get(i).appName);
            }
        }
    }

    public void getAllAppsValue() {
        double appsValue = 0;
        for (int i=0;i<apps.size();i++) {
            appsValue = appsValue + apps.get(i).appPrice;
        }
        System.out.println(appsValue);
    }

    public void getAllAppsInAlphabeticOrder() {
        ArrayList<String> sortedList = (ArrayList<String>) apps.stream().map(a -> a.appName).sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

    public void getAllAppsPricesInAscOrder() {
        List<String> sortedList = apps.stream().map(a -> a.appName).sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

}