package com.wsd.factory_method;

public class StudentWorkFactory implements AbWorkFactory{
    public Work getwork() {
        return new StudentWork();
    }
}
