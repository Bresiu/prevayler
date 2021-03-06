import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Numbers implements Serializable {
    private static final long serialVersionUID = 1l;

    private static int intVariable = 1;

    private final ArrayList<Integer> numbers = new ArrayList<Integer>();

    public static int getIntVariable() {
        return intVariable;
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public List getNumbers() {
        return numbers;
    }

    public int numbersSize() {
        return numbers.size();
    }

    public int returnLastNumber() {
        return numbers.isEmpty() ? 0 : numbers.get(numbers.size() - 1);
    }
}
