package com.carlos.method_ref;

import java.util.function.Function;

interface Test1{
    Boolean test(Object o);
}


class MyClass1{

    public static void main(String[] args) {


        A(o -> o.equals("123"));

        A("123"::equals);

        Function function = "12"::equals;
        Test1 test1 = "123"::equals;
        System.out.println(test1);
        System.out.println(test1.test("123"));

    }

    static void A(Test1 a){
        System.out.println(a.test("123"));
    }


}
//true
//true