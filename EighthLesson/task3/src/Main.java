import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {
        try {
            Task.task();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
