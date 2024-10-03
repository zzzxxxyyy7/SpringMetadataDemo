package com.example.springmetadatademo.Bean;

import com.example.springmetadatademo.Annotation.MyAnnotation;
import com.example.springmetadatademo.Annotation.MyClassAnnotation;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@MyClassAnnotation
@Component
public final class MyBean extends MyAbstract implements Serializable {

    public String key;

    public String value;

    @MyAnnotation
    public static void myMethod1() {
        
    }

    @MyAnnotation
    public String myMethod2() {
        return "hello world";
    }

    public void myMethod3() {
        
    }

    public static class MyInnerClass {
        // 内部类的定义
    }
}