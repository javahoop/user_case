package com.wsd.create_pattern.factory_method;

public class StudentWorkFactory implements AbWorkFactory{
    public Work getwork() {
        return new StudentWork();
    }
}
