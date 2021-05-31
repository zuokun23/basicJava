package com.carlos.method_ref.instance_method;

import java.util.function.BiFunction;

public class V3 {

    public int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {

        //参数1 参数2 返回值
        BiFunction<Integer, Integer, Integer> adder = new V3()::add;
        System.out.println(adder.apply(10, 20));
    }
}
