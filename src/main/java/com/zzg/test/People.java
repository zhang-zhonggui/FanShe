package com.zzg.test;

/**
 * @author ：zzg
 * @description：测试java反转的实体类
 * @date ：2022/1/18 10:06
 */
public class People {

    int  id;
    private String  name;

    public People(){
        System.out.println("构造函数");
    }

    public People(int id, String  name){
        System.out.println("有参数的构造函数："+id+"---"+name);
    }

    public String eat(){
        System.out.println("eat函数");
        return "你好世界";
    }

    public String  eat(String  food){

        System.out.println("food:"+food);
        return  "hahahah";
    }

    private void foo(){
        System.out.println("foo函数");
    }
}
