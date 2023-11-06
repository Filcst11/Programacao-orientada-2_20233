package polimorfismo.mercado;

public abstract class Produto {

    protected String nome;
    protected Double preco;

    Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String imprimirNotaFiscal(){
        return this.nome + "- R$" + this.preco;
    }

    public Double calcularValorTotal(){
        return this.preco;
    }
    
}
