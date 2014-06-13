import org.prevayler.Transaction;

import java.util.Date;

/**
 * To change the state of the business objects, the client code must use a Transaction like this one.
 */
class NumberStorageTransaction implements Transaction {

    private static final long serialVersionUID = -2023934810496653301L;
    private int _numberToKeep;

    NumberStorageTransaction(int numberToKeep) {
        _numberToKeep = numberToKeep;
    }

    public void executeOn(Object prevalentSystem, Date ignored) {
        ((NumberKeeper) prevalentSystem).keep(_numberToKeep);
    }
}
