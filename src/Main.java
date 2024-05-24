import BancoCliente.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Cliente Cliente1 = new Cliente();

        Scanner scanner = new Scanner(System.in);
        

            // Verificando se o usuário já é um cliente do banco.

            while (true) {
                List<Cliente> listaClientes = new ArrayList<>();


                Cliente1.verificarECriarContas(scanner);
                Cliente1.contaDesejada(scanner);
                imprimirListaDeClientes(listaClientes);

            }
        }

    public static void imprimirListaDeClientes(List<Cliente> listaClientes){
        System.out.println("Lista de Clientes: ");
        int contador = 0;
        for(Cliente cliente:listaClientes){
            contador = contador + 1;
            System.out.println(cliente);
        }
        System.out.println("Número de clientes: "+ contador);
    }

}









