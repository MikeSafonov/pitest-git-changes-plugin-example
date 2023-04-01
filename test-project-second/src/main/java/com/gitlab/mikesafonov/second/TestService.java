package com.gitlab.mikesafonov.second;

public class TestService {

    public int calc(int a, int b) {
        int sum = a + b;
        if (a >= b) {
            System.out.println(sum);
            return sum * a;
        }
        callMe(a, b);
        callMe(b, b);
        System.out.println(a);
        return sum * b;
    }

    private void callMe(int a, int b) {
        int i = a + b;
        System.out.println(i);
    }
}
