package com.banco;

public class Correntista {

    private String nomeCorrentista;
    private String cpfCorrentista;
    private String enderecoCorrentista;

    private String profissaoCorrentista;

    public Correntista(String nomeCorrentista, String cpfCorrentista, String enderecoCorrentista, String profissaoCorrentista){
        this.nomeCorrentista = nomeCorrentista;
        this.cpfCorrentista = cpfCorrentista;
        this.enderecoCorrentista = enderecoCorrentista;
        this.profissaoCorrentista = profissaoCorrentista;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public String getCpfCorrentista() {
        return cpfCorrentista;
    }

    public String getEnderecoCorrentista() {
        return enderecoCorrentista;
    }

    public String getProfissaoCorrentista() {
        return profissaoCorrentista;
    }

}
