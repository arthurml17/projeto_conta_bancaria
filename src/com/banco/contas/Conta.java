package com.banco.contas;

import com.banco.Correntista;

abstract class Conta {

    protected Correntista cliente;
    protected String numero;
    protected String numero_agencia;
    protected double saldo;

    public Conta(Correntista cliente, String numero, String numero_agencia){
        this.cliente = cliente;
        this.numero = numero;
        this.numero_agencia = numero_agencia;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public abstract boolean sacar(double valor);

    public double getSaldo(){
        return this.saldo;
    }

}
