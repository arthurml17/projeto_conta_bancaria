import com.banco.Correntista;
import com.banco.contas.ContaCorrente;
import com.banco.contas.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Correntista correntista1 = new Correntista("Arthur", "71215894430", "Rua A, 123", "Desenvolvedor");

        ContaCorrente contaCorrente1 = new ContaCorrente(correntista1, "001", "001", 500);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(correntista1, "002", "002");

        contaCorrente1.depositar(900);
        double saldoAtual = contaCorrente1.getSaldo();
        contaCorrente1.sacar(1500);


    }
}