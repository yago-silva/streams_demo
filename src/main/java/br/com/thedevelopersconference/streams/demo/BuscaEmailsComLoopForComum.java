package br.com.thedevelopersconference.streams.demo;

import java.util.ArrayList;
import java.util.List;

public class BuscaEmailsComLoopForComum {

    public static void main(String[] args) {
        // Objetivo: Email de 2 participantes inscritos na RedHat e que ganharam uma camisa P.
        List<Participante> participantesTdc = ParticipantesTdc.listaTodos();
        
        List<String> emails = new ArrayList<>();
        
        for(int i = 0 ; i < participantesTdc.size() && emails.size() < 2; i++){
            Participante participante = participantesTdc.get(i);
            if(participante.isInscrito() && participante.ganhouCamisaP()){
                emails.add(participante.getEmail());
            }
        }
        
        System.out.println(emails);
    }
}