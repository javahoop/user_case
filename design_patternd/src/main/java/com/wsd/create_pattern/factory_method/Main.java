package com.wsd.create_pattern.factory_method;

public class Main {
    public static void main(String[] args) {
        AbWorkFactory studentWorkFactory = new StudentWorkFactory();
        studentWorkFactory.getwork().doWork();
        AbWorkFactory teacherWorkFactory = new TeacherWorkFactory();
        teacherWorkFactory.getwork().doWork();
    }
}
