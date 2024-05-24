package BancoOperacoes;


import BancoCliente.Cliente;
import BancoContas.Contas;
import InterfaceConta.Conta;

import java.util.List;

public class Banco {

    String nome;
    private List<Cliente> contasList;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getContasList() {
        return contasList;
    }

    public void setContasList(List<Cliente> contasList) {
        this.contasList = contasList;
    }


}
