package com.ansh;

import com.ansh.annotation.AboutAuthor;
import com.ansh.annotation.Author;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        Class annotationExample = AnnotationExample.class;
        for (Method method : annotationExample.getMethods()) {
            if (method.isAnnotationPresent(Author.class)) {
                try {
                    for (Annotation anno : method.getDeclaredAnnotations())
                        System.out.println("Annotation in Method '" + method + "' : " + anno);
                    Author methodAnn = method.getAnnotation(Author.class);
                    AboutAuthor methodAn1 = method.getAnnotation(AboutAuthor.class);
                    System.out.println("Author of the Method is " + methodAnn.name());
                    System.out.println("Author of the Method is " + methodAn1.name() + ", designation of the author is : " + methodAn1.designation());
                } catch (Throwable ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}