package com.carlos.method_ref.static_method;

import java.util.function.BiFunction;

public class V4 {

    static public int add(int a, int b){
        return a + b;
    }
    static public float add(float a, int b){
        return a + b;
    }
    static public float add(float a, float b){
        return a + b;
    }

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> adder1 = V4::add;
        BiFunction<Float, Integer, Float> adder2 = V4::add;
        BiFunction<Float, Float, Float> adder3 = V4::add;
        System.out.println(adder1.apply(1, 2));
        System.out.println(adder2.apply(1.0f, 3));
        System.out.println(adder3.apply(1.0f, 3.0f));
    }
}
