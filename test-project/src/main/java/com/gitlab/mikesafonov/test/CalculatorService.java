package com.gitlab.mikesafonov.test;

public class CalculatorService {

    public int calc(int a, int b) {
        int sum = a + b;
        if (a > b) {
            return sum * a;
        }
        callMe(a, b);
        System.out.println(sum * a);
        int c = sum + sum + a;
        return sum * b;
    }

    private void callMe(int a, int b) {
        int i = a + b;
        System.out.println(i);
    }

}
