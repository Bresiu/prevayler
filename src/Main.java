import org.prevayler.Prevayler;
import org.prevayler.PrevaylerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        printMessage();
        Prevayler prevayler = PrevaylerFactory.createPrevayler(new Numbers(), "Prevayler Demo");
        new RandomNumberGenerator(prevayler).start();
    }

    static private void printMessage() throws Exception {
        System.out.println("\nRobustness Reminder: You can kill this process at any time.\n" +
                "When you restart the system, you will see that nothing was lost.\n" +
                "Press Enter to continue.\n");
        (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }
}
