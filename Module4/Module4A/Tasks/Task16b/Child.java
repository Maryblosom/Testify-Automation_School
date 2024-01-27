package com.Mary.Task16b;

public class Child extends Parents {
    public static void main(String[] args) {
        Child papaSon = new Child();
        papaSon.papa("Henry", 3);

        Child mamaDaughter = new Child();
        mamaDaughter.mama("Lily", 9);

        papaSon.grandPapa();
        mamaDaughter.grandMama();
    }
    @Override
    public void papa(String name, int age) {
        System.out.println(name+" is their 1st son");
    }

    @Override
    public void mama(String name, int age) {
        System.out.println(name+ " come here their mother beckoned on her daughter.");
    }
}
