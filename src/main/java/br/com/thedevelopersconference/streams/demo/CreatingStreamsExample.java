package br.com.thedevelopersconference.streams.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreamsExample {
    
    public static void main(String[] args) {
        //Criando um stream
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        
        //Stream apatir de uma lista (com o método default stream da interface java.util.Collection)
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream2 = numeros.stream();
        
        //Stream de inteiros!
        IntStream.range(1, 5000);
        
        //Stream de inteiros infinito!
        IntStream intStream = IntStream.iterate(1, i -> i+1);
        intStream.forEach(new IntConsumer() {
            
            @Override
            public void accept(int value) {
               System.out.println(value);
            }
        });
    }   
}
