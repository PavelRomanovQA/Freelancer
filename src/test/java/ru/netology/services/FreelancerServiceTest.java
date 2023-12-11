package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FreelancerServiceTest {
    @Test
    public void testCalculateCase1() {
        FreelancerService service = new FreelancerService();

        int actual = service.calculate(10_000,3_000,20_000);
        int expenses = 3;

        Assertions.assertEquals(expenses, actual);
    }

    @Test
    public void testCalculateCase2() {
        FreelancerService service = new FreelancerService();

        int actual = service.calculate(100_000, 60_000, 150_000);
        int expenses = 2;

        Assertions.assertEquals(expenses, actual);
    }
}
