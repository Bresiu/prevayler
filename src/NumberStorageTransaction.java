import org.prevayler.Transaction;

import java.util.Date;

public class NumberStorageTransaction implements Transaction {

    private static final long serialVersionUID = 1L;
    private int randomNumber;

    NumberStorageTransaction(int numberToKeep) {
        randomNumber = numberToKeep;
    }

    public void executeOn(Object prevalentSystem, Date ignored) {
        ((Numbers) prevalentSystem).addNumber(randomNumber);
    }
}
