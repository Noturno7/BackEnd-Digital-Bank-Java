package BancoContas;

import BancoCliente.Cliente;

public class ContaCorrente extends Contas{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        imprimirExtrato();
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("+++ Extrato Conta Corrente +++");
        super.imprimirDados();
    }

}
