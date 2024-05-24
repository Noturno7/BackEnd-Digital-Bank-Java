package BancoContas;

import BancoCliente.Cliente;
import InterfaceConta.Conta;

import java.util.Scanner;

public abstract class Contas  implements Conta {

    public static final int AGENCIAS = 7265;
    public static int SEQUENCIAL = 1453;

    protected String agencia;
    protected double saldo = 0;
    protected int numeroConta;
    protected Cliente cliente;



    public Contas(Cliente cliente) {
        this.agencia = agencia;
        this.numeroConta =  numeroConta++;
        this.cliente = cliente;
    }
    @Override
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque no valor de R$"+ valor + " concluído com exito.");

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito no valor de R$"+ valor + " concluído com exito.");

    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("Transferência no valor de R$"+ valor + " concluída com exito.");
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void imprimirDados(){
        Cliente cliente = new Cliente();
        System.out.println("Titular: "+ cliente.getNome());
        System.out.println("Agência: "+ agencia);
        System.out.println("Número da agência: "+ numeroConta);
        System.out.println("Saldo: "+ saldo);
    }

}