package org.hebuter.aop;

import org.springframework.stereotype.Component;

@Component
public class LogInterceptor {
    public void beforeSave() {
        System.out.println("before");
    }
    public void afterSave() {
        System.out.println("after");
    }
    public void aroundSave() {
        System.out.println("around");
    }
}
