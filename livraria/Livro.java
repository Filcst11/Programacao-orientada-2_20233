package livraria;

public class Livro {    
    int id;
    public String nome;
    public int anoPublicacao;
    public String autor;

    //Método construtor:
    Livro(int id, String nome, int anoPublicacao, String autor){
        this.id = id;
        this.autor = autor;
        this.nome = nome;
        this.anoPublicacao = anoPublicacao;
    }
    
    public String imprimir(){
        String retorno;
        retorno = this.id + "-" + this.nome+ "-"+ this.autor+ "-"+ this.anoPublicacao;
        return retorno;
    }
   
}


