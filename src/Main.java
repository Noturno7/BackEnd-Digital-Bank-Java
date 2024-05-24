import BancoCliente.Cliente;
import BancoContas.Contas;
import InterfaceConta.Conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static BancoCliente.Cliente.*;

public static void main (String[] args) {
    // Apenas um Main para testar.
    while (true) {
        List<Cliente> listaClientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = verificarECriarContas(scanner);
        contaDesejada(scanner, cliente);
        verificarDados(cliente);
        listaClientes.add(cliente);
        imprimirListaDeClientes(listaClientes);
        System.out.println("Deseja adicionar outro cliente?(s/n)");
        String loopOperacional = scanner.next();
        scanner.nextLine();
        if(loopOperacional.equalsIgnoreCase("s")){

        }
        else break;
    }
}

    public static void imprimirListaDeClientes(List<Cliente> listaClientes){
        System.out.println("Lista de Clientes: ");
        int contador = 0;
        for(Cliente cliente:listaClientes){
            contador = contador + 1;
            System.out.println(cliente.getNome());
        }
        System.out.println("Número de clientes: "+ contador);
}










