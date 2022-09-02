package ru.netology.servise;

import org.junit.Test;
import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void purchaseAmountLessThan1000(){
        int amount =888;
        int actual = service.remain(amount);
        int expected = 112;
        assertEquals(expected,actual);
    }
    @Test
    public void purchaseAmount1000(){
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    public void purchaseAmountOver1000(){
        int amount = 2222;
        int actual = service.remain(amount);
        int expected = 778;
        assertEquals(expected,actual);
    }

}/*

    @Test
    public void purchaseAmountOver1000 (){

        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual,expected);
    }
}*/