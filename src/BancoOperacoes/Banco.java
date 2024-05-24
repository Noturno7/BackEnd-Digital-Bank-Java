package BancoOperacoes;


import BancoContas.Contas;
import InterfaceConta.Conta;

import java.util.List;

public class Banco {

    String nome;
    private List<Contas> contasList;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contas> getContasList() {
        return contasList;
    }

    public void setContasList(List<Contas> contasList) {
        this.contasList = contasList;
    }
}
