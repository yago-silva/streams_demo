package br.com.thedevelopersconference.streams.demo;

import java.util.stream.IntStream;

public class ShortCircuitExample {
    
    public static void main(String[] args) {
        IntStream.iterate(1, i -> i+1)
            .map(i -> i * i)
            .limit(100)
            .forEach(System.out::println);
    }
    
}
