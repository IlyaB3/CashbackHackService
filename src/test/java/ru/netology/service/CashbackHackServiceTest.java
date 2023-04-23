package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    void testShowingTheNeedToCubForLargeAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;

        int actual = service.remain(amount);
        int expected = 300;
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
    void testWithAPurchaseAmountOfMoreThan1000Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1011;

        int actual = service.remain(amount);
        int expected = 989;

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