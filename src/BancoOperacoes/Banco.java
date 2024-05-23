package BancoOperacoes;

import BancoCliente.Cliente;
import BancoContas.Contas;

import java.util.List;

public class Banco {

    public void sacar(){
    }
    public void depositar(){
    }
    public void verificarSaldo(){
    }
    private List<Contas> contasList;

    public List<Contas> getContasList() {
        return contasList;
    }

    public void setContasList(List<Contas> contasList) {
        this.contasList = contasList;
    }
}
