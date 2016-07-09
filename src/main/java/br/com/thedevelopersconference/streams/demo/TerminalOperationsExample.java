package br.com.thedevelopersconference.streams.demo;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalOperationsExample {

    public static void main(String[] args) {
        List<Participante> participantes = ParticipantesTdc.listaTodos();

        // Operações Simples
        participantes.stream().count();
        boolean participantInscrito = participantes.stream().anyMatch(Participante::isInscrito);
        Optional<String> optionalEmail2 = participantes.stream().map(Participante::getEmail).findAny();

        // Collectors
        List<String> emailsList = participantes.stream().map(Participante::getEmail).collect(Collectors.toList());
        List<String> emailsLinkedList = participantes.stream().map(Participante::getEmail).collect(Collectors.toCollection(LinkedList::new));
        Set<String> emailsSet = participantes.stream().map(Participante::getEmail).collect(Collectors.toSet());

        Map<TamanhoCamisa, List<Participante>> participantesPorTamanho = participantes.stream()
                     .collect(Collectors.groupingBy(Participante::getTamanhoCamisa));
        
        
        Map<TamanhoCamisa, List<String>> emailsPorTamanho = participantes.stream()
                .collect(Collectors.groupingBy(Participante::getTamanhoCamisa, Collectors.mapping(Participante::getEmail, Collectors.toList())));
    }
}
