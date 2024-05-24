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
        this.numeroConta =  numeroConta;
        this.cliente = cliente;
    }


    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void imprimirDados(){
        verificarDados();
    }
}
