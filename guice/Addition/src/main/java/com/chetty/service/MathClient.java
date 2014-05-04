package com.chetty.service;

import com.google.inject.Inject;

/**
 * Created by kevinschaeffer on 5/3/14.
 */
//public class MathClient {
//    public void go() {
//        IMathAdditionService mathService = MathServiceFactory.getInstance();
//        mathService.sumOfAllConsecutiveNumbers(1000);
//    }
//}

public class MathClient {
    private final IMathAdditionService mathService;

    @Inject
    public MathClient(IMathAdditionService mathService) {
        this.mathService = mathService;
    }
    public int sumOfAllConsecutiveNumbers(int n) {
        return mathService.sumOfAllConsecutiveNumbers(n);
    }
}
