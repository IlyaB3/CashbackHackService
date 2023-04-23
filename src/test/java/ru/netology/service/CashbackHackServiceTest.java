package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
public class CashbackHackServiceTest {

    @Test
    void testWithAPurchaseAmountOf600Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 600;
        int actual = service.remain(amount);
        int expected = 400;
        assertEquals(actual,expected);
    }
    @Test
    void testWithAPurchaseAmountOf0Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual,expected);
    }
    @Test
    void testWithAPurchaseAmountOf1200Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 800;
        assertEquals(actual,expected);
    }
    @Test
    void testWithAPurchaseAmountOf1000Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual,expected);
    }
}
