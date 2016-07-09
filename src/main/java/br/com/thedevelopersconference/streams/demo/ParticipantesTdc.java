package br.com.thedevelopersconference.streams.demo;

import java.util.Arrays;
import java.util.List;

public class ParticipantesTdc {
    
    private static List<Participante> participantes = Arrays.asList(
            new Participante(true, TamanhoCamisa.P, "ei_voce_ai@nomail.da.plateia"),
            new Participante(true, TamanhoCamisa.M, "joao@gmail.com"),
            new Participante(true, TamanhoCamisa.P, "por_favor_nao_durma@nomail.da.palestra"),
            new Participante(true, TamanhoCamisa.P, "developer.yagosilva@gmail.com"),
            new Participante(true, TamanhoCamisa.G, "developer.yagosilva@gmail.com"),
            new Participante(true, TamanhoCamisa.M, "se_esse_email_aparecer_algo_deu_muito_errado@nomail.da.palestra")
            
    );
    
    public static List<Participante> listaTodos(){
        return participantes;
    }
}