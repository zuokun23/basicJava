package com.carlos.stream.map;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class V1 {

    public static void main(String[] args) {
        String[] strArr = { "abcd", "bcdd", "defde", "fTr" };
        List<String> collect = Arrays.stream(strArr).map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(collect);
    }
}
