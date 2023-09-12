package Heranca.empresa;

public class Diretor extends Funcionario{
    
   
    private Integer qtdGerencias;

    public Diretor(String nome, Integer cpf, Integer telefone, Integer qtdGerencias){
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setQtdGerencias(qtdGerencias);        
    }

     
    public Integer getQtdGerencias(){
        return this.qtdGerencias;
    }
    public void setQtdGerencias(Integer qtdGerencias){
        this.qtdGerencias = qtdGerencias;
    }  

    @Override
    public double getSalario(){
        return 7000;
    }
    @Override
    public double getBonificacao(){
        return (getSalario() * 0.4);
    }
    
    public String toString(){
        return "{" +
            "nome: " + getNome() + "\n" +
            "cpf: " + getCpf() + "\n" +
            "telefone: " + getTelefone() + "\n" +
            "qtdGerencias: " + getQtdGerencias() + "\n" +
            "Salario: " + getSalario() + "\n" +
            "Bonificação: " + getBonificacao() + "}\n";
            
    }
}
