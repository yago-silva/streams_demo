package br.com.thedevelopersconference.streams.demo;

public class Participante {

    private boolean inscrito;

    private TamanhoCamisa tamanhoCamisa;

    private String email;

    public Participante(boolean inscrito, TamanhoCamisa tamanhoCamisa, String email) {
        this.inscrito = inscrito;
        this.tamanhoCamisa = tamanhoCamisa;
        this.email = email;
    }

    public boolean isInscrito() {
        return inscrito;
    }

    public void setInscrito(boolean inscrito) {
        this.inscrito = inscrito;
    }

    public boolean ganhouCamisaP() {
        return tamanhoCamisa == TamanhoCamisa.P;
    }
    
    public TamanhoCamisa getTamanhoCamisa() {
        return tamanhoCamisa;
    }

    public void setTamanhoCamisa(TamanhoCamisa tamanhoCamisa) {
        this.tamanhoCamisa = tamanhoCamisa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}