package BancoCliente;

import BancoContas.ContaCorrente;
import BancoContas.ContaPoupanca;
import BancoContas.Contas;

import java.util.Scanner;

public class Cliente {

    Scanner scanner = new Scanner(System.in);
    public String nome;
    public int idade;


    public String getNome() {
        Cliente cliente = new Cliente();
        return cliente.nom;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    @Override
    public String toString() {
        return "nome: " + nome +
                ", idade: " + idade ;
    }
    public static Cliente verificarECriarContas(Scanner scanner) {
        String nomeCliente;
        double saldo;
        double limiteChequeEspecial = 500;
        String validarUsuario, agencia;
        int numero;

        System.out.println("Você já é cliente dos nossos bancos? (s/n)");
        validarUsuario = scanner.next();
        scanner.nextLine(); // Consumir a linha restante

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

            System.out.println("Por favor, digite o seu nome: ");
            nomeCliente = scanner.nextLine();
            Cliente cliente2 = new Cliente();
            cliente2.setNome(nomeCliente);
            System.out.println("Digite o seu saldo para verificação:");
            saldo = scanner.nextDouble();
            scanner.nextLine(); // Consumir a linha restante

            System.out.println("Conta verificada, seja bem-vindo(a) " + nomeCliente + ", sua agência é " + agencia + ", conta " + numero + " e seu saldo é de R$" + saldo + " já disponível para saque.");

            Cliente cliente = new Cliente();
            cliente.setNome(nomeCliente);
            // Adicione outras informações ao cliente conforme necessário
            return cliente;

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

            System.out.println("Por favor, digite o seu nome: ");
            nomeCliente = scanner.nextLine();
            Cliente cliente2 = new Cliente();
            cliente2.setNome(nomeCliente);
            System.out.println("Por favor, digite o seu saldo desejável: ");
            saldo = scanner.nextDouble();
            scanner.nextLine(); // Consumir a linha restante

            if (saldo > 800) {
                System.out.println("Infelizmente não é possível liberar este saldo para novos clientes, o sistema irá definir o seu saldo como o saldo máximo para novos clientes. Para mais informações fale com um dos nossos atendentes.");
                saldo = 800;
            }

            // Imprimimos a mensagem final com os dados do cliente e a sua agência
            System.out.println("Olá " + nomeCliente + ", obrigado(a) por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é de R$" + saldo + " já disponível para saque.");

            Cliente cliente = new Cliente();
            cliente.setNome(nomeCliente);
            // Adicione outras informações ao cliente conforme necessário
            return cliente;
        }
    }
    public static Cliente contaDesejada(Scanner scanner){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Qual é o seu tipo de conta? Para Conta Corrente(c). Para Conta Poupança(p): ");
        String tipoConta = scanner.next();
        scanner.nextLine();
        Cliente cliente = new Cliente();
        if (tipoConta.equalsIgnoreCase("c")){
            Contas cc = new ContaCorrente(cliente);
            //Execute as ações bancarias aqui.
        }
        else {
            Contas cc = new ContaPoupanca(cliente);
            //Execute as ações bancarias aqui.
        }
        return cliente;
    }
    public static Cliente verificadDados(){
        Cliente cliente = new Cliente();
            System.out.println("Titular: "+ cliente.nome);
            System.out.println("Agência: "+ agencia);
            System.out.println("Número da agência: "+ numeroConta);
            System.out.println("Saldo: "+ saldo);
    }
}
