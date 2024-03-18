package com.banco.contas;

import com.banco.Correntista;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Correntista cliente, String numero, String numero_agencia) {
        super(cliente, numero, numero_agencia);
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= super.saldo){
            super.saldo -= valor;
            return true;
        }else{
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public void atualizarSaldo(double taxaJuros){
        super.saldo *= (1 + taxaJuros);
    }
}
