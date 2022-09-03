package ru.netology.servise;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
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



   @org.junit.jupiter.api.Test
    public void junitPurchaseAmountOver1000 (){
        CashbackHackService service1 = new CashbackHackService();
        int amount = 1900;
        int expected = 100;
        int actual = service1.remain(amount);
       Assertions.assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    public void junitPurchaseAmount1000(){
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    public void junitPurchaseAmountLessThan1000(){
        int amount = 800;
        int expected = 200;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected,actual);
    }

}