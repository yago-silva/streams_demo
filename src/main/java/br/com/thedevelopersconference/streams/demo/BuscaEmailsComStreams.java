package br.com.thedevelopersconference.streams.demo;

import java.util.List;
import java.util.stream.Collectors;

public class BuscaEmailsComStreams {

    public static void main(String[] args) {
        // Objetivo: Email de 2 participantes inscritos na RedHat e que ganharam uma camisa P.
        List<Participante> participantesTdc = ParticipantesTdc.listaTodos();
        
        List<String> emails = participantesTdc.stream()
                        .filter(Participante::isInscrito)
                        .filter(Participante::ganhouCamisaP)
                        .map(Participante::getEmail)
                        .limit(2)
                        .collect(Collectors.toList());
        
        System.out.println(emails);
        
    }
}