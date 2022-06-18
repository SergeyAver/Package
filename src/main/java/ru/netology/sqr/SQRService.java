package ru.netology.sqr;

public class SQRService {
    public int calculateSQR(int minNumber, int maxNumber) {
        int counter = 0;
        for (int a = 10; a <= 99; a++) {
            if (a * a >= minNumber) {
                if (a * a <= maxNumber) {
                    counter = counter + 1;
                }
            }
        }
        System.out.println("counter");
        return counter;
    }
}

