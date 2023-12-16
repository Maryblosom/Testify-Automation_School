package com.Graham.Task12;

public class ClassB {
    public static void main(String[] args) {
        AccessClassB access = new AccessClassB();
        access.accessBMethod();

    }

    protected void accessBMethod(){
        System.out.println("This is class B");
    }
}

