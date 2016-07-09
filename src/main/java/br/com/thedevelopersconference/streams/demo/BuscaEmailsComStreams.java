package br.com.thedevelopersconference.streams.demo;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BuscaEmailsComStreams {

    public static void main(String[] args) {
        // Objetivo: Email de 2 participantes inscritos na RedHat e que ganharam uma camisa P.
        List<Participante> participantesTdc = ParticipantesTdc.listaTodos();
        
        List<String> emails = participantesTdc.stream()
                        .filter(new Predicate<Participante>() {

                            @Override
                            public boolean test(Participante participant) {
                                return participant.isInscrito();
                            }
                        })
                        .filter(new Predicate<Participante>() {

                            @Override
                            public boolean test(Participante participant) {
                                return participant.ganhouCamisaP();
                            }
                        })
                        .map(new Function<Participante, String>() {

                            @Override
                            public String apply(Participante participant) {
                                return participant.getEmail();
                            }
                        })
                        .limit(2)
                        .collect(Collectors.toList());
        
        System.out.println(emails);
        
    }
}