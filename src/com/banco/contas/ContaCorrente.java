package com.banco.contas;

import com.banco.Correntista;

public class ContaCorrente extends Conta{

    private double limite;
    public ContaCorrente(Correntista cliente, String numero, String numero_agencia, double limite) {
        super(cliente, numero, numero_agencia);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor > super.saldo){
            if(valor <= super.saldo + this.limite){
                System.out.println("Saldo insuficiente, você vai entrar em cheque especial.");
                super.saldo -= valor;
                return true;
            }else{
                System.out.println("Saldo e limite insuficiente.");
                return false;
            }
        }else{
            super.saldo -= valor;
            return true;
        }
    }

    public void calculaJuros(double taxaJuros){
        if(super.saldo < 0){
            super.saldo *= (1 + taxaJuros);
        }
    }

}
