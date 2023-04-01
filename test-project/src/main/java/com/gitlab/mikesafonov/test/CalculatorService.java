package com.gitlab.mikesafonov.test;

public class CalculatorService {

    public int calc(int a, int b) {
        int sum = a + b;
        if (a > b) {
            return sum * a;
        }
        callMe2(a, b);
        System.out.println(sum);
        return sum * b;
    }

    private void callMe2(int a, int b) {
        int i = a + b;
        System.out.println(i);
    }

}
