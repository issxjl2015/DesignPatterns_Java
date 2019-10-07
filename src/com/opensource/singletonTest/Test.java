package com.opensource.singletonTest;

import com.opensource.singleton.SingletonOne;
import com.opensource.singleton.SingletonTwo;

public class Test {

    public static void main(String[] args) {
        SingletonOne one = SingletonOne.getInstance();
        System.out.println(one);
        SingletonTwo two = SingletonTwo.getInstance();
        System.out.println(two);
        System.out.println("============================");
        SingletonTwo two1 = SingletonTwo.getInstance();
        SingletonTwo two2 = SingletonTwo.getInstance();
        System.out.println(two1);
        System.out.println(two2);
    }
}
