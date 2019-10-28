/**
 * @author Colin Mills
 */

import org.junit.jupiter.api.*;
import static org.junit.Assert.*;


public class TestSlipperySlot {

    @Test
    public void testJackpot() {
        SlipperySlot test = new SlipperySlot();
        //Create jackpot array that does not meet any other requirements (ie. 42, perfect square)
        int[] array = new int[]{10, 10, 10, 10, 10};
        int correctPayoff = 1000000;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testJackpot

    @Test
    public void testJackpotPerfectSquarePowTwo() {
        SlipperySlot test = new SlipperySlot();
        //Create jackpot array that also is a perfect square and power of two
        int[] array = new int[]{4, 4, 4, 4, 4};
        int correctPayoff = 1000010;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testJackpotPerfectSquarePowTwo

    @Test
    public void testJackpotPerfectSquare() {
        SlipperySlot test = new SlipperySlot();
        //Create jackpot array that is also perfect squares
        int[] array = new int[]{9, 9, 9, 9, 9};
        int correctPayoff = 1000007;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testJackpotPerfectSquare

    @Test
    public void testJackpotPowTwo() {
        SlipperySlot test = new SlipperySlot();
        //Create jackpot array that is also power of two
        int[] array = new int[]{8, 8, 8, 8, 8};
        int correctPayoff = 1000003;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testJackpotPowTwo

    @Test
    public void testJackpotFortyTwo() {
        SlipperySlot test = new SlipperySlot();
        //Create jackpot array that is of 42s
        int[] array = new int[]{42, 42, 42, 42, 42};
        int correctPayoff = 1000002;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testJackpotFortyTwo

    @Test
    public void testFourOfAKind() {
        SlipperySlot test = new SlipperySlot();
        //Create array that has 4 of a kind but does not meet any other requirements (ie. 42, perfect square)
        int[] array = new int[]{10, 10, 10, 10, 11};
        int correctPayoff = 10000;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testFourOfAKind

    @Test
    public void testFourOfAKindAllThree() {
        SlipperySlot test = new SlipperySlot();
        //Create array that has 4 of a kind that also has other 3 bonuses
        int[] array = new int[]{42, 4, 4, 4, 4};
        int correctPayoff = 10012;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testFourOfAKindAllThree

    @Test
    public void testFourOfAKindPowTwoFortyTwo() {
        SlipperySlot test = new SlipperySlot();
        //Create array that has 4 of a kind that has 42 and power of two
        int[] array = new int[]{42, 8, 8, 8, 8};
        int correctPayoff = 10005;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testFourOfAKindPowTwoFortyTwo

    @Test
    public void testFourOfAKindFortyTwoPerfSquare() {
        SlipperySlot test = new SlipperySlot();
        //Create array that has 4 of a kind that has 42 and perf square
        int[] array = new int[]{42, 9, 9, 9, 9};
        int correctPayoff = 10009;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testFourOfAKind

    @Test
    public void testFourOfAKindPowTwoPerfSquare() {
        SlipperySlot test = new SlipperySlot();
        //Create array that has 4 of a kind that has power of two and perfect squares
        int[] array = new int[]{4, 4, 4, 4, 11};
        int correctPayoff = 10010;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testFourOfAKindPowTwoPerfSquare

    @Test
    public void testFourOfAKindFortyTwo() {
        SlipperySlot test = new SlipperySlot();
        //Create array that has 4 of a kind that has 42
        int[] array = new int[]{42, 11, 11, 11, 11};
        int correctPayoff = 10002;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testFourOfAKindFortyTwo

    @Test
    public void testFourOfAKindPowTwo() {
        SlipperySlot test = new SlipperySlot();
        //Create array that has 4 of a kind with power of two
        int[] array = new int[]{8, 11, 11, 11, 11};
        int correctPayoff = 10003;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testFourOfAKindPowTwo

    @Test
    public void testFourOfAKindPerfSquare() {
        SlipperySlot test = new SlipperySlot();
        //Create array that has 4 of a kind and a perfect square
        int[] array = new int[]{9, 11, 11, 11, 11};
        int correctPayoff = 10007;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testFourOfAKindPerfSquare

    @Test
    public void testFullHouse() {
        SlipperySlot test = new SlipperySlot();
        //Create Full House array that does not meet any other requirements (ie. 42, perfect square)
        int[] array = new int[]{10, 10, 10, 11, 11};
        int correctPayoff = 5000;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testFullHouse

    @Test
    public void testFullHouseAllThree() {
        SlipperySlot test = new SlipperySlot();
        //Create Full House array that has all three bonuses
        int[] array = new int[]{4, 4, 4, 42, 42};
        int correctPayoff = 5012;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testFullHouseAllThree

    @Test
    public void testFullHouseFortyTwoPowTwo() {
        SlipperySlot test = new SlipperySlot();
        //Create Full House array that has 42 and power of two
        int[] array = new int[]{42, 42, 42, 8, 8};
        int correctPayoff = 5005;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testFullHouseFortyTwoPowTwo

    @Test
    public void testFullHouseFortyTwoPerfSquare() {
        SlipperySlot test = new SlipperySlot();
        //Create Full House array that has 42 and a perf square
        int[] array = new int[]{42, 42, 42, 9, 9};
        int correctPayoff = 5009;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testFullHouseFortyTwoPerfSquare

    @Test
    public void testFullHousePowTwoPerfSquare() {
        SlipperySlot test = new SlipperySlot();
        //Create Full House array that has power of two and a perf square
        int[] array = new int[]{4, 4, 4, 11, 11};
        int correctPayoff = 5010;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testFullHousePowTwoPerfSquare

    @Test
    public void testFullHouseFortyTwo() {
        SlipperySlot test = new SlipperySlot();
        //Create Full House array that has 42
        int[] array = new int[]{42, 42, 42, 11, 11};
        int correctPayoff = 5002;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testFullHouseFortyTwo

    @Test
    public void testFullHousePowTwo() {
        SlipperySlot test = new SlipperySlot();
        //Create Full House array that has power of two
        int[] array = new int[]{8, 8, 8, 11, 11};
        int correctPayoff = 5003;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testFullHousePowTwo

    @Test
    public void testFullHousePerfSquare() {
        SlipperySlot test = new SlipperySlot();
        //Create Full House array that has a perf square
        int[] array = new int[]{9, 9, 9, 11, 11};
        int correctPayoff = 5007;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testFullHousePerfSquare

    @Test
    public void testThreeOfAKind() {
        SlipperySlot test = new SlipperySlot();
        //Create Full House array that does not meet any other requirements (ie. 42, perfect square)
        int[] array = new int[]{10, 10, 10, 11, 13};
        int correctPayoff = 100;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testThreeOfAKind

    @Test
    public void testThreeOfAKindAllThree() {
        SlipperySlot test = new SlipperySlot();
        //Create 3 of a kind array that has all three bonuses
        int[] array = new int[]{42, 42, 42, 4, 13};
        int correctPayoff = 112;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testThreeOfAKindAllThree

    @Test
    public void testThreeOfAKindFortyTwoPowTwo() {
        SlipperySlot test = new SlipperySlot();
        //Create 3 of a kind array that has 42 and pow of two
        int[] array = new int[]{42, 42, 42, 8, 13};
        int correctPayoff = 105;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testThreeOfAKindFortyTwoPowTwo

    @Test
    public void testThreeOfAKindFortyTwoPerfSquare() {
        SlipperySlot test = new SlipperySlot();
        //Create 3 of a kind array that has 42 and a perf square
        int[] array = new int[]{42, 42, 42, 9, 13};
        int correctPayoff = 109;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testThreeOfAKindFortyTwoPerfSquare

    @Test
    public void testThreeOfAKindPowTwoPerfSquare() {
        SlipperySlot test = new SlipperySlot();
        //Create 3 of a kind array that has pow two and perf square
        int[] array = new int[]{4, 4, 4, 11, 13};
        int correctPayoff = 110;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testThreeOfAKindPowTwoPerfSquare

    @Test
    public void testThreeOfAKindFortyTwo() {
        SlipperySlot test = new SlipperySlot();
        //Create 3 of a kind array that has 42
        int[] array = new int[]{42, 42, 42, 11, 13};
        int correctPayoff = 102;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testThreeOfAKindFortyTwo

    @Test
    public void testThreeOfAKindPowTwo() {
        SlipperySlot test = new SlipperySlot();
        //Create 3 of a kind array that has pow two
        int[] array = new int[]{8, 8, 8, 11, 13};
        int correctPayoff = 103;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testThreeOfAKindPowTwo

    @Test
    public void testThreeOfAKindPerfSquare() {
        SlipperySlot test = new SlipperySlot();
        //Create 3 of a kind array that has a perf square
        int[] array = new int[]{9, 9, 9, 11, 13};
        int correctPayoff = 107;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testThreeOfAKindPerfSquare

    @Test
    public void testTwoOfAKind() {
        SlipperySlot test = new SlipperySlot();
        //Create 2 of a kind array that does not meet any other requirements (ie. 42, perfect square)
        int[] array = new int[]{10, 10, 13, 17, 19};
        int correctPayoff = 10;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testTwoOfAKind

    @Test
    public void testTwoOfAKindAllThree() {
        SlipperySlot test = new SlipperySlot();
        //Create two of a kind array that has all three bonuses
        int[] array = new int[]{4, 4, 42, 17, 19};
        int correctPayoff = 22;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testTwoOfAKindAllThree

    @Test
    public void testTwoOfAKindFortyTwoPowTwo() {
        SlipperySlot test = new SlipperySlot();
        //Create 2 of a kind array that has 42 and pow 2
        int[] array = new int[]{42, 8, 8, 17, 19};
        int correctPayoff = 15;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testTwoOfAKindFortyTwoPowTwo

    @Test
    public void testTwoOfAKindFortyTwoPerfSquare() {
        SlipperySlot test = new SlipperySlot();
        //Create 2 of a kind array that has 42 and perf square
        int[] array = new int[]{42, 42, 9, 17, 19};
        int correctPayoff = 19;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testTwoOfAKindFortyTwoPerfSquare

    @Test
    public void testTwoOfAKindPowTwoPerfSquare() {
        SlipperySlot test = new SlipperySlot();
        //Create 2 of a kind array that has pow two and perf square
        int[] array = new int[]{4, 4, 13, 17, 19};
        int correctPayoff = 20;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testTwoOfAKindPowTwoPerfSquare

    @Test
    public void testTwoOfAKindFortyTwo() {
        SlipperySlot test = new SlipperySlot();
        //Create 2 of a kind array that has 42
        int[] array = new int[]{42, 42, 13, 17, 19};
        int correctPayoff = 12;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testTwoOfAKindFortyTwo

    @Test
    public void testTwoOfAKindPowTwo() {
        SlipperySlot test = new SlipperySlot();
        //Create 2 of a kind array that has a pow 2
        int[] array = new int[]{8, 8, 13, 17, 19};
        int correctPayoff = 13;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testTwoOfAKindPowTwo

    @Test
    public void testTwoOfAKindPerfSquare() {
        SlipperySlot test = new SlipperySlot();
        //Create 2 of a kind array that has a perf square
        int[] array = new int[]{9, 9, 13, 17, 19};
        int correctPayoff = 17;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testTwoOfAKindPerfSquare

    @Test
    public void testAllThree() {
        SlipperySlot test = new SlipperySlot();
        //Create array that has all three bonuses
        int[] array = new int[]{42, 4, 13, 17, 19};
        int correctPayoff = 12;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testAllThree

    @Test
    public void testFortyTwoPowTwo() {
        SlipperySlot test = new SlipperySlot();
        //Create array that has 42 and pow 2
        int[] array = new int[]{42, 8, 13, 17, 19};
        int correctPayoff = 5;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testFortyTwoPowTwo

    @Test
    public void testFortyTwoPerfSquare() {
        SlipperySlot test = new SlipperySlot();
        //Create array that has 42 and perf square
        int[] array = new int[]{42, 9, 13, 17, 19};
        int correctPayoff = 9;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testFortyTwoPerfSquare

    @Test
    public void testPowTwoPerfSquare() {
        SlipperySlot test = new SlipperySlot();
        //Create array that has pow two and perf square
        int[] array = new int[]{4, 11, 13, 17, 19};
        int correctPayoff = 10;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testPowTwoPerfSquare

    @Test
    public void testFortyTwo() {
        SlipperySlot test = new SlipperySlot();
        //Create array that has 42
        int[] array = new int[]{42, 11, 13, 17, 19};
        int correctPayoff = 2;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testFortyTwo

    @Test
    public void testPowTwo() {
        SlipperySlot test = new SlipperySlot();
        //Create array that has pow two
        int[] array = new int[]{8, 11, 13, 17, 19};
        int correctPayoff = 3;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testPowTwo

    @Test
    public void testPerfSquare() {
        SlipperySlot test = new SlipperySlot();
        //Create array that has a perf square
        int[] array = new int[]{9, 11, 13, 17, 19};
        int correctPayoff = 7;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testPerfSquare

    @Test
    public void testNoPayout() {
        SlipperySlot test = new SlipperySlot();
        //Create array that does not meet any requirements
        int[] array = new int[]{3, 7, 11, 17, 19};
        int correctPayoff = 0;

        assertEquals(correctPayoff, test.payOff(array));
    }//END testNoPayout

} //END TestSlipperySlots
