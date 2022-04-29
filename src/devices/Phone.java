package devices;

import java.net.URI;
import java.security.URIParameter;

public class Phone extends Device {
    static String uribase = "https://www.applications.server/v1.0";
    static final URI serverUriAddress = URI.create(uribase);

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

    public boolean InstallAnnApp(URI uriAppName) {
        return uriAppName.isAbsolute();
    }
}