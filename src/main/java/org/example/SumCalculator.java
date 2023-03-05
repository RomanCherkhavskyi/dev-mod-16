package org.example;

public class SumCalculator {

    public int sum(int n) throws IllegalArgumentException{
        int result = 0;


        for (int i = 0; i <= n; i++) {
            result += i;
        }

        if (result == 0 && n == 0) {
            throw new IllegalArgumentException();
        }
        else {
            return result;
        }
    }
}
