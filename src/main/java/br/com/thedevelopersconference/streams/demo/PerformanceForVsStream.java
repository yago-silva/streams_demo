package br.com.thedevelopersconference.streams.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PerformanceForVsStream {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        
        for(int i = 0 ; i < 9000000 ; i++ ){
            numeros.add(i);
        }
        
        usandoFor(numeros);
        usandoStream(numeros);
        usandoParellelStream(numeros);
    }

    private static void usandoFor(List<Integer> numeros) {
        long inicio = System.currentTimeMillis();
        
        for(int n : numeros){
            n = n;
        }
        
        long fim = System.currentTimeMillis();
        System.out.println("\nUsando for: "+ (fim - inicio) + "ms");
    }
    
    private static void usandoStream(List<Integer> numeros) {
        long inicio = System.currentTimeMillis();
        
        numeros.stream()
                .forEach(n -> {n = n;});
        
        long fim = System.currentTimeMillis();
        System.out.println("\nUsando Stream: "+ (fim - inicio) + "ms");
    }
    
    private static void usandoParellelStream(List<Integer> numeros) {
        long inicio = System.currentTimeMillis();
        
        numeros.parallelStream()
            .forEach(n -> {n = n;});
        
        long fim = System.currentTimeMillis();
        System.out.println("\nUsando Parallel Stream: "+ (fim - inicio) + "ms");
    }
}