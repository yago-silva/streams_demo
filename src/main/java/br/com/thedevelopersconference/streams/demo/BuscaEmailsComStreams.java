package br.com.thedevelopersconference.streams.demo;

import java.util.List;

public class BuscaEmailsComStreams {

    public static void main(String[] args) {
        // Objetivo: Email de 2 participantes inscritos na RedHat e que ganharam uma camisa P.
        List<Participante> participantesTdc = ParticipantesTdc.listaTodos();
    }
}