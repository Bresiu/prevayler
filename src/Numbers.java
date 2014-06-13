import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Numbers implements Serializable {
    private static final long serialVersionUID = 1l;

    private final ArrayList<Integer> numbers = new ArrayList<Integer>();

    public void addNumber(Integer number) {
        numbers.add(number);
    }

    public List getNumbers() {
        return numbers;
    }
}
