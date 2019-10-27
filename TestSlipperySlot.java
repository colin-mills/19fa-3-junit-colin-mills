//import org.junit.jupiter.api.Test;

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
    public void testNoPayout() {

        SlipperySlot test = new SlipperySlot();

        //Create jackpot array that does not meet any  requirements (ie. 42, perfect square)
        int[] array = new int[]{3, 7, 11, 17, 19};

        int correctPayoff = 0;

        assertEquals(correctPayoff, test.payOff(array));


    }//END testJackpot



} //END TestSlipperySlots
