import org.prevayler.Prevayler;

import java.util.Random;

public class RandomNumberGenerator {

    private static Prevayler prevayler;
    private static Numbers numbers;

    public RandomNumberGenerator(Prevayler prevayler) {
        RandomNumberGenerator.prevayler = prevayler;
        numbers = (Numbers) prevayler.prevalentSystem();
    }

    void start() {
        while (true) {
            int random = generateRandomNumber();
            prevayler.execute(new NumberStorageTransaction(random));

            int randomNumbersSize = numbers.numbersSize();

            System.out.println("Random numbers generated: " + randomNumbersSize
                    + ". Last number generated: " + random + " Previous number: " + numbers.returnLastNumber());
            if (randomNumbersSize > 100) {
                System.out.println("current - 100 number: " + numbers.getNumbers().get(numbers.numbersSize() - 100));
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private int generateRandomNumber() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(100);
    }
}
