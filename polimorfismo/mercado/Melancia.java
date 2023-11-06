package polimorfismo.mercado;

public class Melancia extends Produto implements ProdutoUnidade {

    private Integer unidade;

    public Melancia(String nome, Double preco, Integer unidade){
        super(nome,preco);
        this.unidade = unidade;
    }

    @Override
    public Double calcularPrecoUnidade() {
        return (this.preco * this.unidade);
    }

    @Override
    public Double calcularValorTotal(){
        return calcularPrecoUnidade();
    }

    @override
    public String imprimirNotaFiscal(){
        return this.nome + " "+ this.unidade +"x R$" + this.preco + " - R$" + this.calcularPrecoUnidade();
    }
    

    
}
