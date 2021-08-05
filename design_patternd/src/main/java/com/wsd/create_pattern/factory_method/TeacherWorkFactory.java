package com.wsd.create_pattern.factory_method;

public class TeacherWorkFactory implements AbWorkFactory{
    public Work getwork() {
        return new TeacherWork();
    }
}
