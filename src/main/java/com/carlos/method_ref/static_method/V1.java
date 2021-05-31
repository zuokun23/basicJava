package com.carlos.method_ref.static_method;

interface Sayable{
    public void say();
}

public class V1 {

    static void saySomething(){
        System.out.println("Hello, this is static method");
    }

    public static void main(String[] args) {
        //Referring static method
        Sayable sayable = V1::saySomething;
        //Calling interface method
        sayable.say();
    }
}
//Hello, this is static method