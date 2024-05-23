package BancoContas;

import BancoCliente.Cliente;
import InterfaceConta.Conta;

public abstract class Contas  implements Conta {

    protected int agencia;
    protected double saldo = 0;
    protected int numeroConta;
    protected Cliente cliente;
    protected String nome;
    protected int idade;

    private static final int AGENCIAS = 7265;
    private static int SEQUENCIAL = 1453;

    public Contas(Cliente cliente) {
        this.agencia = Contas.AGENCIAS;
        this.numeroConta =  SEQUENCIAL++;
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
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprimirDados(){
        System.out.println("Agência: "+ agencia);
        System.out.println("Número da agência: "+ numeroConta);
        System.out.println("Saldo: "+ saldo);
    }
}