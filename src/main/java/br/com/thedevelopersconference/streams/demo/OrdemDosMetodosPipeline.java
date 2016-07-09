package br.com.thedevelopersconference.streams.demo;

import java.util.stream.IntStream;

public class OrdemDosMetodosPipeline {

    public static void main(String[] args) {
        IntStream.range(1, 5)
        .map(i -> {
            System.out.println(i+": passou no map");
            return i;
        })
        .filter(i -> {
            System.out.println(i+": passou no filter");
            return i % 2 == 0;
        })
        .forEach(n -> {});
    }
}
