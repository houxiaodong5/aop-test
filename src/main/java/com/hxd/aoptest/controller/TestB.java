package com.hxd.aoptest.controller;

public class TestB {
    public TestB(){
        System.out.println("B");
    }
}
class TestBA extends TestB{


    public static void main(String[] args) {
        TestBA testBA = new TestBA();
    }
}

abstract class AAA{
    abstract void ss();
}