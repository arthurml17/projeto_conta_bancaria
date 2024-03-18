import com.banco.Correntista;
import com.banco.contas.ContaCorrente;
import com.banco.contas.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Correntista correntista1 = new Correntista("Arthur", "71215894430", "Rua A, 123", "Desenvolvedor");

        ContaCorrente contaCorrente1 = new ContaCorrente(correntista1, "001", "001", 1000);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(correntista1, "002", "002");

        contaCorrente1.depositar(2000);
        System.out.println("deposito contaCorrente: "+contaCorrente1.getSaldo());

        contaCorrente1.sacar(3000);
        System.out.println("saque contaCorrente: "+contaCorrente1.getSaldo());

        contaPoupanca1.depositar(200);
        System.out.println("deposito contaPoupanca: "+contaPoupanca1.getSaldo());

        contaPoupanca1.sacar(500);
        System.out.println("saque contaPoupanca: "+contaPoupanca1.getSaldo());

        contaCorrente1.calculaJuros(0.01);
        System.out.println("juros contaCorrente: "+contaCorrente1.getSaldo());

        contaPoupanca1.atualizarSaldo(0.05);
        System.out.println("rendimento contaPoupanca: "+contaPoupanca1.getSaldo());

    }
}