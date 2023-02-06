package com.riccardodegni.W4L1.week4_lesson1.config_bean;

public class ItalianPhone extends Phone {
    private final String prefix = "+39";
    
    public ItalianPhone(String number) {
        this.number = prefix + number;
    }
}
