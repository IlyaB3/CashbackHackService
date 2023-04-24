package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void testWithAPurchaseAmountOf600Rubles() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 600;

        int actual = cashbackHackService.remain(amount);
        int expected = 400;
        assertEquals(actual, expected);
    }

    @Test
    public void testWithAPurchaseAmountOf0Rubles() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void testWithAPurchaseAmountOf1200Rubles() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1200;

        int actual = cashbackHackService.remain(amount);
        int expected = 800;
        assertEquals(actual, expected);
    }

    @Test
    public void testWithAPurchaseAmountOf1000Rubles() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

}