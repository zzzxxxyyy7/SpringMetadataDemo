package com.example.springmetadatademo.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyClassAnnotation {
    String value() default "";
}