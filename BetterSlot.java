

public class BetterSlot {

    public int[] pullTheLever() {
        int[] slotArray = new int[]{0, 0, 0, 0, 0};

        for(int i=0; i<5; i++) {
            double randomNumber = Math.random();
            randomNumber = (randomNumber * 50) + 1;
            int slotNumber = (int) randomNumber;
            slotArray[i] = slotNumber;
        }///End loop to populate array

        return slotArray;
    }//END pullTheLever

    int payOff( int[] values ) {
        //Initialize all variables
        int one, two, three, four, five, countOne, countTwo, countThree, countFour, countFive, payout;
        boolean isJackpot, isFourOfAKind, isThreeOfAKind, isFullHouse,
                isTwoOfAKind, isFortyTwo, isPowTwo, isPerfSquare;
        countOne = countTwo = countThree = countFour = countFive = payout = 0;
        isJackpot = isFourOfAKind = isThreeOfAKind = isFullHouse =
                isTwoOfAKind = isFortyTwo = isPowTwo = isPerfSquare = false;
        one = values[0];
        two = values[1];
        three = values[2];
        four = values[3];
        five = values[4];
        //Loop through array to determine count of numbers and find bonuses
        for (int number: values) {
            if (number == one) {countOne++;}
            if (number == two) {countTwo++;}
            if (number == three) {countThree++;}
            if (number == four) {countFour++;}
            if (number == five) {countFive++ ;}
            //Bonus tests
            if (number == 42) {isFortyTwo = true;} //Test for 42
            if (number == 1 || number == 2 || number == 4 || number == 8
                    || number == 16 || number == 32) {
                isPowTwo = true;
            }//Test for power of 2
            if (number == 1 || number == 4 || number == 9 || number == 16
                    || number == 25 || number == 36 || number == 49) {
                isPerfSquare = true;
            }//Test for perfect square
        }
        //Evaluate what will be won based on count
        if(countOne == 5 || countTwo == 5 ||countThree == 5 ||countFour == 5 ||countFive == 5) {isJackpot = true;}
        if(countOne == 4 || countTwo == 4 ||countThree == 4 ||countFour == 4 ||countFive == 4) {isFourOfAKind = true;}
        if(countOne == 2 || countTwo == 2 ||countThree == 2 ||countFour == 2 ||countFive == 2) {isTwoOfAKind = true;}
        if(countOne == 3 || countTwo == 3 ||countThree == 3 ||countFour == 3 ||countFive == 3) {
            isThreeOfAKind = true;
            if(countOne == 2 || countTwo == 2 ||countThree == 2 ||countFour == 2 ||countFive == 2) {
                isTwoOfAKind = false;
                isThreeOfAKind = false;
                isFullHouse = true;
            }//End test for full house
        }//End Test for Three of a kind
        //Sum up payouts
        if(isJackpot) {payout += 1000000;}
        if(isFourOfAKind) {payout += 10000;}
        if(isThreeOfAKind) {payout += 100;}
        if(isFullHouse) {payout += 5000;}
        if(isTwoOfAKind) {payout += 10;}
        if(isFortyTwo) {payout += 2;}
        if(isPowTwo) {payout += 3;}
        if(isPerfSquare) {payout += 7;}

        return payout;
    }//END payOff

}//END BetterSlot
