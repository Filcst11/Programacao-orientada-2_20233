package exception.banco;

public class ContaCorrenteee {
    
    private String nome;
    private Integer numero;
    private Double saldo;

    //essa classe privada obriga o usuário a passar os atributos sempre que  ele for criar um objeto
    private ContaCorrenteee(){}


    public ContaCorrenteee(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = 0.0;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    



}
