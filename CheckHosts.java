import java.io.IOException;

public class CheckHosts {

    public static void main(String[] args) {
        String[] servers = null;

        try {
            FileArrayProvider fap = new FileArrayProvider("hosts.txt");
            servers = fap.readLines();
        }
        catch (IOException ex) {
            System.out.println(ex);
            return;
        }

        for (String server: servers)
        {
            Thread t = null;
            t = new Thread(new PingHost(server));
            t.start();
        }
    }
}
