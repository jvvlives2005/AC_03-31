package nyc.c4q.jvvlives2005;
import java.util.HashMap;
public class ExitTicket {

    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<String, Integer>();

        stock.put("basketball", 3);
        stock.put("running shoes", 4);
        stock.put("jumping rope", 2);
        stock.put("power bars", 15);

        stock.get("jumping rope");

        stock.put("running shoes", 4);


        stock.size();
    }
}
