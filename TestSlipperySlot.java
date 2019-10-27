import org.junit.jupiter.api.*;
 
//org.junit.jupiter.api.*;



public class TestSlipperySlot {

    @Test
    public void testJackpot() {

        SlipperySlot test = new SlipperySlot();

        //Create jackpot array that does not meet any other requiriments (ie. 42, perfect square)
        int[] array = new int[]{10, 10, 10, 10, 10};

        int correctPayoff = 1000000;

        assertEquals(correctPayoff, test.payOff(array), "Error with payoff in testJackpot");

    }



} //END TestSlipperySlots
