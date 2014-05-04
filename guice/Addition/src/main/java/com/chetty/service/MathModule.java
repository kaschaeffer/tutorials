package com.chetty.service;

import com.google.inject.AbstractModule;

/**
 * Created by kevinschaeffer on 5/3/14.
 */
public class MathModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IMathAdditionService.class).to(SnailAdditionService.class);
    }

}
