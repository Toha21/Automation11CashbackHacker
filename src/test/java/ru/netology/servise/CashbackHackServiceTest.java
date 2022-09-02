package ru.netology.servise;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void purchaseAmountLessThan1000(){

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual,expected);
    }
    @Test
    public void purchaseAmount1000 (){

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual,expected);
    }
    @Test
    public void purchaseAmountOver1000 (){

        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual,expected);
    }
}