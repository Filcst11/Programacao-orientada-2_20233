package Heranca.empresa;

public class Engenheiro extends Funcionario{
    
    
    private Integer crea;
    private String projeto;

    public Engenheiro(String nome, Integer cpf, Integer telefone, Integer crea, String projeto){
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setCrea(crea);
        setProjeto(projeto);
    }

    
    public Integer getCrea(){
        return this.crea;
    }
    public void setCrea(Integer crea){
        this.crea = crea;
    }
    public String getProjeto(){
        return this.projeto;
    }
    public void setProjeto(String projeto){
        this.projeto = projeto;
    }

    @Override
    public double getSalario(){
        return 3000;
    }
    @Override
    public double getBonificacao(){
        return (getSalario() * 0.2);
    }
    

    public String toString(){
        return "{" +
            "nome: " + getNome() + "\n" +
            "cpf: " + getCpf() + "\n" +
            "telefone: " + getTelefone() + "\n" +
            "crea: " + getCrea() + "\n" +
            "projeto: " + getProjeto() + "}\n" +
            "Salario: " + getSalario() + "\n" +
            "Bonificação: " + getBonificacao() + "}\n";
    }


}
