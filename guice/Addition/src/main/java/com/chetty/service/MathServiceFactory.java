package com.chetty.service;

/**
 * Created by kevinschaeffer on 5/3/14.
 */
public class MathServiceFactory {
    private MathServiceFactory() {}
    private static IMathAdditionService mathService = new SnailAdditionService();

    public static IMathAdditionService getInstance() {
        return mathService;
    }

    public static void setMathService(IMathAdditionService service) {
        mathService = service;
    }
}
