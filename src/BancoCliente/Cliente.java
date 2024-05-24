package BancoCliente;

import BancoContas.ContaCorrente;
import BancoContas.ContaPoupanca;

import java.util.Scanner;

public class Cliente {
    private Scanner scanner = new Scanner(System.in);
    private String nome;
    private int idade;
    private double saldo;
    private String agencia;
    private int numeroConta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public static Cliente verificarECriarContas(Scanner scanner) {
        String nomeCliente;
        double saldo;
        String validarUsuario, agencia;
        int numero;

        System.out.println("Você já é cliente dos nossos bancos? (s/n)");
        validarUsuario = scanner.next();
        scanner.nextLine(); // Consumir a linha restante

        Cliente cliente2 = new Cliente();

        if (validarUsuario.equalsIgnoreCase("s")) {
            System.out.println("Por favor, digite o número da sua conta: ");
            numero = scanner.nextInt();
            scanner.nextLine();

            // Análise de qual agência o cliente é
            if (numero < 1000) {
                agencia = "058-A";
            } else if (numero >= 1000 && numero <= 2000) {
                agencia = "058-B";
            } else if (numero > 2000 && numero <= 3000) {
                agencia = "058-C";
            } else if (numero > 3000 && numero <= 4000) {
                agencia = "058-D";
            } else if (numero > 4000 && numero <= 5000) {
                agencia = "058-E";
            } else if (numero > 5000 && numero <= 6000) {
                agencia = "058-F";
            } else {
                System.out.println("Número inválido!");
                return null;
            }
            cliente2.setAgencia(agencia);
            cliente2.setNumeroConta(numero);

            System.out.println("Por favor, digite o seu nome: ");
            nomeCliente = scanner.nextLine();
            cliente2.setNome(nomeCliente);

            System.out.println("Digite o seu saldo para verificação:");
            saldo = scanner.nextDouble();
            cliente2.setSaldo(saldo);
            scanner.nextLine(); // Consumir a linha restante

            System.out.println("Conta verificada, seja bem-vindo(a) " + nomeCliente + ", sua agência é " + agencia + ", conta " + numero + " e seu saldo é de R$" + saldo + " já disponível para saque.");

        } else {
            System.out.println("Por favor, digite o número que você deseja para a sua conta:");
            numero = scanner.nextInt();
            scanner.nextLine();

            // Análise de qual agência o cliente vai ser
            if (numero < 1000) {
                agencia = "058-A";
            } else if (numero >= 1000 && numero <= 2000) {
                agencia = "058-B";
            } else if (numero > 2000 && numero <= 3000) {
                agencia = "058-C";
            } else if (numero > 3000 && numero <= 4000) {
                agencia = "058-D";
            } else {
                System.out.println("Número inválido!");
                return null;
            }
            cliente2.setAgencia(agencia);
            cliente2.setNumeroConta(numero);

            System.out.println("Por favor, digite o seu nome: ");
            nomeCliente = scanner.nextLine();
            cliente2.setNome(nomeCliente);

            System.out.println("Por favor, digite o seu saldo desejável: ");
            saldo = scanner.nextDouble();
            cliente2.setSaldo(saldo);
            scanner.nextLine(); // Consumir a linha restante

            if (saldo > 800) {
                System.out.println("Infelizmente não é possível liberar este saldo para novos clientes, o sistema irá definir o seu saldo como o saldo máximo para novos clientes. Para mais informações fale com um dos nossos atendentes.");
                saldo = 800;
                cliente2.setSaldo(saldo);
            }

            System.out.println("Olá " + nomeCliente + ", obrigado(a) por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é de R$" + saldo + " já disponível para saque.");
        }

        return cliente2;
    }

    public static void contaDesejada(Scanner scanner, Cliente cliente) {
        System.out.println("Qual é o seu tipo de conta? Para Conta Corrente(c). Para Conta Poupança(p): ");
        String tipoConta = scanner.next();
        scanner.nextLine();

        if (tipoConta.equalsIgnoreCase("c")) {
            ContaCorrente cc = new ContaCorrente(cliente);
            // Execute as ações bancarias aqui.
        } else {
            ContaPoupanca cc = new ContaPoupanca(cliente);
            // Execute as ações bancarias aqui.
        }
    }
    public static void verificarDados(Cliente cliente) {
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("Agência: " + cliente.getAgencia());
        System.out.println("Número da conta: " + cliente.getNumeroConta());
        System.out.println("Saldo: " + cliente.getSaldo());
    }
}
