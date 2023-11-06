package collections;

import java.util.ArrayList;

public class ExemploArrayList {

    public static void main(String[] args) {
        ArrayList<String> listaDeNome = new ArrayList<>();

        listaDeNome.add("Alice");
        listaDeNome.add("Bruno");
        listaDeNome.add("Carol");
        listaDeNome.add("Dylan");

        //
        for(String nome : listaDeNome){
            System.out.println(nome);
        }

        //para saber se existe
        if(listaDeNome.contains("Carol")){
            System.out.println("\nCarol está na lista\n");
        }else{
            System.out.println("\nCarol Não está na lista\n");
        }

        //Removendo carol
        listaDeNome.remove("Carol");


        if(listaDeNome.contains("Carol")){
            System.out.println("\nCarol está na lista\n");
        }else{
            System.out.println("\nCarol Não está na lista\n");
        }

        //limpando a lista;
        listaDeNome.clear();
        
        if(listaDeNome.isEmpty()){
            System.out.println("A lista está vazia!");
        }else{
            System.out.println("A lista não está vazia");
        }

        
    }
}