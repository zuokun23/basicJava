package com.carlos.method_ref.instance_method;

interface Sayable{
    void say(V1 v1, String a, String b);
}

interface Sayable1{
    void say(String a, String b);
}


public class V1 {

    //需要设计三个参数this, a, b
    public void saySomething(String a, String b){
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        //类::实例方法
        Sayable sayable = V1::saySomething;
        sayable.say(new V1(), "1", "2");

        //对象::实例方法
        Sayable1 sayable1 = new V1()::saySomething;
        sayable1.say("你", "好！");
    }
}
//1 2
//你 好！