package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //Test 1
    @Test
    public void emptyStringTest(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    //Test 2
    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //Test 3
    @Test
    public void backwardsBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    //Test 4
    @Test
    public void threeBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("][["));
    }

    //TTest 5
    @Test
    public void twoPairsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    //Test 6
    @Test
    public void dungeonsAndDragonsCharacterWithBracketsIsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Ironsight]"));
    }

    //Test 7
    @Test
    public void dungeonsAndDragonsCharacterWithBackwardsBracketsIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Ironsight["));
    }

    //Test 8
    @Test
    public void threeOpensOneCloseReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]"));
    }

    //Test 9
    @Test
    public void threeCloseOneOpenReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]["));
    }

    //Test 10
    @Test
    public void witcherFortressWithInsertedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Kaer][Morhen]"));
    }

    //Test 11
    @Test
    public void witcherFortressWithBackwardsBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Kaer[ ]Morhen["));
    }

    //Test 12
    @Test
    public void witcherFortressWithBracketsAroundSecondWordReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Kaer [Morhen]"));
    }

}
