package Heranca.empresa;

public class Funcionario {

    protected String nome;
    protected Integer cpf;
    protected Integer telefone;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Integer getCpf(){
        return this.cpf;
    }
    public void setCpf(Integer cpf){
        this.cpf = cpf;
    }
    public Integer getTelefone(){
        return this.telefone;
    }
    public void setTelefone(Integer telefone){
        this.telefone = telefone;
    }

    public double getSalario(){
        return 1500;
    }
    public double getBonificacao(){
        return (getSalario() * 0.1);
    }
    
}
