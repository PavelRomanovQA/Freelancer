package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int counter = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                counter++;
                money -= expenses;
                money /= 3;
            } else {
                money += income;
                money -= expenses;
            }
        }
        return counter;
    }
}