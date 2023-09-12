package Heranca.empresa;

public class Gerente extends Funcionario{

    private Integer subordinados;

    public Gerente(String nome, Integer cpf, Integer telefone, Integer subordinados){
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setSubordinados(subordinados);
    }

    public Integer getSubordinados() {
        return subordinados;
    }
    public void setSubordinados(Integer subordinados) {
        this.subordinados = subordinados;
    }

    @Override
    public double getSalario(){
        return 5000;
    }
    @Override
    public double getBonificacao(){
        return (getSalario() * 0.3);
    }
    
    public String toString(){
        return "{" +
            "nome: " + getNome() + "\n" +
            "cpf: " + getCpf() + "\n" +
            "telefone: " + getTelefone() + "\n" +
            "subordinados: " + getSubordinados() + "}\n" +
            "Salario: " + getSalario() + "\n" +
            "Bonificação: " + getBonificacao() + "}\n";
            
    }
}
