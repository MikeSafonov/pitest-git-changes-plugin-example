package com.gitlab.mikesafonov.second;

public class TestService {

    public int calc(int a, int b) {
        int sum = a + b;
        if (a >= b) {
            System.out.println(a);
            return sum * a;
        }
        callMe2(b, b);
        System.out.println(sum);
        return sum * b;
    }

    private void callMe2(int a, int b) {
        int i = a + b;
        System.out.println(i);
    }
}
