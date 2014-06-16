import org.prevayler.Prevayler;
import org.prevayler.PrevaylerFactory;

public class GetNumbers {
    public static java.util.List migrate(String PATH_TO_JOURNALS) throws Exception {
        Prevayler prevayler = PrevaylerFactory.createPrevayler(new Numbers(), PATH_TO_JOURNALS);
        new RandomNumberGenerator(prevayler);
        Numbers numbers = (Numbers) prevayler.prevalentSystem();
        return numbers.getNumbers();
    }
}