package com.carlos.method_ref.static_method;

import java.util.function.BiFunction;

public class V3 {
    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = V3::add;
        System.out.println(adder.apply(10, 20));
    }
}
//30