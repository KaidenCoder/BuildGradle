package com.newgradle.kurosaki.javalib;

import java.util.Random;

public class JavaJoke {

    private final String jokes[] = {
            "What a joke!",
            "Joke joke joke ",
            "Joke jokitty joke joke joke",
            "Don't laugh, I am serious",
            "Don't laugh at my Joke"
    };
    public String getJoke(){
        Random rand = new Random();
        int value = rand.nextInt(jokes.length);
        return jokes[value];
    }
}
