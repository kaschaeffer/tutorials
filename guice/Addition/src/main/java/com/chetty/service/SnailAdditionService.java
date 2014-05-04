package com.chetty.service;

/**
 * Created by kevinschaeffer on 5/3/14.
 */
public class SnailAdditionService implements IMathAdditionService {
    @Override
    public int sumOfAllConsecutiveNumbers(int n) {
        int sum = 0;
        long startTime = System.nanoTime();

        for (int i=1; i<=n; i++) {
            sum += i;
        }

        long endTime = System.nanoTime();

        System.out.println("Snail Addition Service - Sum : " + sum);
        System.out.println("Time Complexity - O(n) and Time Taken : " + (endTime - startTime));
        return sum;
    }
}
