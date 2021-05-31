package com.carlos.method_ref.static_method;

import java.util.function.Function;

interface Test{
    String test(Integer a);
}

//得出方法引用是lambda 的缩写
class MyClass{

    public static void main(String[] args) {

        A(a -> String.valueOf(a));
        System.out.println((Function)String::valueOf);
    }

    static void A(Test a){
        System.out.println(a);
    }
}
//com.carlos.stream.MyClass$$Lambda$1/764977973@27d6c5e0
//com.carlos.stream.MyClass$$Lambda$2/363771819@7b23ec81
