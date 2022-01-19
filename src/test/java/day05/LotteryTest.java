package day05;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    Lottery lottery;
    List<Integer> numbers;

    @Test
    void testWithFiveNumbers(){
        lottery=new Lottery(90,5);
        assertEquals(5,lottery.startLottery().size());
        for (Integer i:lottery.startLottery()) {
            assertTrue(i<=90&&i>0);
        }
        numbers=lottery.startLottery();
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i+1; j < numbers.size() ; j++) {
                assertFalse(numbers.get(i)==numbers.get(j));
            }
        }
    }

    @Test
    void testWithSixNumbers(){
        lottery=new Lottery(45,6);
        assertEquals(6,lottery.startLottery().size());
        for (Integer i:lottery.startLottery()) {
            assertTrue(i<=45&&i>0);
        }
        numbers=lottery.startLottery();
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i+1; j < numbers.size() ; j++) {
                assertFalse(numbers.get(i)==numbers.get(j));
            }
        }
    }
}