package com.ansh;

import com.ansh.annotation.AboutAuthor;
import com.ansh.annotation.Author;
import com.ansh.annotation.CustomMethod;

public class AnnotationExample {

    @Author
    @AboutAuthor(name = "Anshul Sharma", designation = "SDE-2")
    @CustomMethod
    public void firstMethod() {

    }

    @Author(name = "Anshul Sharma")
    @AboutAuthor(name = "AS")
    @CustomMethod
    public void secondMethod() {

    }
}
