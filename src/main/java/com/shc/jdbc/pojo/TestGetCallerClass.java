package com.shc.jdbc.pojo;


import sun.reflect.Reflection;
//Reflection的getCallerClass的使用：可以得到调用者的类. 
/**
 * 
 * @author shc
 *0 和小于0  -   返回 Reflection类

1  -   返回自己的类

2  -    返回调用者的类

3. 4. ....层层上传。
 */
public class TestGetCallerClass
{
    public static void main(String[] args)
    {
        Test2 test=new Test2();
        test.g();
    }
}


 class Test2
{
    public  void g(){
        gg();
    }
    public  void gg(){
        System.out.println(Reflection.getCallerClass(-1));
        System.out.println(Reflection.getCallerClass(0));
        System.out.println(Reflection.getCallerClass(1));
        System.out.println(Reflection.getCallerClass(2));
        System.out.println(Reflection.getCallerClass(3));
        System.out.println(Reflection.getCallerClass(4));
        System.out.println(Reflection.getCallerClass(5));
    }

}



