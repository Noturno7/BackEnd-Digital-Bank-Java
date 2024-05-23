package BancoContas;

import BancoCliente.Cliente;

public class ContaPoupanca extends Contas{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirDados();
    }
}
