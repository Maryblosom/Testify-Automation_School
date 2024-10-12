package com.Mary.Task15;

import com.Mary.Task13.Class_A;

public class class_A {
    private String name = "Nelly";
    private boolean hungry = true;
    private char sex = 'F';

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {
        // An object is created and methods are invoked
        class_A newClass = new class_A();
        newClass.method1("Nelly");
        newClass.method2(true);
        newClass.method3('F', 'M');
    }
    public void method1(String name){
        System.out.println("My nick name is "+name);
    }
    public void method2(Boolean hungry){
        ;
    }
    public void method3(char sex, char sex2){
    }
}
