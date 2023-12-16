package com.Graham.Task12;

public class ClassB {
    public static void main(String[] args) {
        AccessClassA access = new AccessClassA();
        access.accessAMethod();

    }

    protected void accessAMethod(){
        System.out.println("This is class B");
    }
}

