package br.com.thedevelopersconference.streams.demo;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluation {

    public static void main(String[] args) {
        Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).map(i -> {
            System.out.println(i+"Passou por aqui");
            return i;
        }).collect(Collectors.toList());
        
        System.out.println("fim");
    }
}
