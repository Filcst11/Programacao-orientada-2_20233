package exception.banco;


import java.util.ArrayList;


import exception.banco.exceptions.ContaNaoEncontradaException;
import exception.banco.exceptions.SaldoInválidoException;

public class Banco {
    
    private ArrayList<ContaCorrenteee> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public void abrirConta(String nome, Integer numero){
        ContaCorrenteee conta = new ContaCorrenteee(nome, numero);
        this.contas.add(conta);
    }

    public ContaCorrenteee pesquisarConta(String nome){
        ContaCorrenteee contaEncontrada = null;
        for(ContaCorrenteee c : contas){
            if(c.getNome().equals(nome)){
                contaEncontrada = c;
            }
        }
        return contaEncontrada;
    }

    public void depositar(String nomeConta, Double valorDeposito){
        if(valorDeposito <= 0){
            throw new SaldoInválidoException();
        }
        
        ContaCorrenteee contaDeposito = null;
        for (ContaCorrenteee c : contas){
            if(c.getNome().equals(nomeConta)){
                contaDeposito = c;
            }
        }

        if(contaDeposito == null){
            throw new ContaNaoEncontradaException();
        }else{
            contaDeposito.setSaldo(contaDeposito.getSaldo()+valorDeposito);
            System.out.println("\nDeposito realizado com sucesso!\n");
        }

    }

}
