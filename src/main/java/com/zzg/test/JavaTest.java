package com.zzg.test;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static java.lang.Class.forName;

/**
 * @author ：zzg
 * @description：
 * @date ：2022/1/18 10:06
 */
public class JavaTest {
    @Test
    public void test() throws Exception {
        Class aClass = forName("com.zzg.test.People");
        Constructor[] constructors = aClass.getConstructors();
        System.out.println(constructors + "--------");
        //无参构造函数
        Constructor noArgs = aClass.getConstructor();
        Object o = noArgs.newInstance();
        //有参数的构造函数
        Constructor constructor = aClass.getConstructor(int.class,String.class);
        Object o1 = constructor.newInstance(1, "张三");
        System.out.println(o1);


        People people = new People();
        System.out.println(people);

    }
}
