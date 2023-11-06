package polimorfismo;

import polimorfismo.mercado.Alho;
import polimorfismo.mercado.CarrinhoDeCompras;
import polimorfismo.mercado.Melancia;

public class Executavel {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Alho a1 = new Alho("alho comum", 2.00, 2.0);
        Melancia m1 = new Melancia("melancia comum", 12.00, 5);

        carrinho.adicionarProduto(m1);
        carrinho.adicionarProduto(a1);

        System.out.println(carrinho.finalizarCompras());


    }
    
}
