package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    private int totalNumbers;
    private int numberOfNumbers;

    public Lottery(int totalNumbers, int numberOfNumbers) {
        this.totalNumbers = totalNumbers;
        this.numberOfNumbers = numberOfNumbers;
    }

    public List<Integer> startLottery() {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        while (numbers.size() < numberOfNumbers) {
            int number = random.nextInt(1, totalNumbers);
            if (!numbers.contains(number)) {
                numbers.add(number);
            }
        }
        return numbers;
    }
}


