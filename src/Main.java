import BancoCliente.Cliente;
import BancoContas.ContaCorrente;
import BancoContas.ContaPoupanca;
import BancoContas.Contas;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Cliente Gabriel = new Cliente();
        Gabriel.setNome("Gabriel");
        Gabriel.setIdade(19);

        Contas cc = new ContaCorrente(Gabriel);
        Contas cp = new ContaPoupanca(Gabriel);

        cc.imprimirExtrato();
        System.out.println("\n");
        cp.imprimirExtrato();

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
    }
}






