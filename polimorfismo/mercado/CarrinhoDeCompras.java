package polimorfismo.mercado;

import java.util.ArrayList;

public class CarrinhoDeCompras {

    private ArrayList<Produto> produtos;

    public CarrinhoDeCompras(){
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p){
        this.produtos.add(p);
    }

    public String finalizarCompras(){
        String notaFiscal = "";
        Double valorTotal = 0.0;

        for (Produto p : produtos) {
            valorTotal += p.calcularValorTotal();
            notaFiscal += p.imprimirNotaFiscal() + "\n";
        }
        return notaFiscal + "\n\nValor Total: R$" + valorTotal;
    }
    
}
