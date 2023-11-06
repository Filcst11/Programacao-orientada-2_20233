package collections;

import java.util.HashSet;

public class ExemploHashSet {
    public static void main(String[] args) {
        
        //Esse HashSet é bom pq ele não adiciona elementos iguais no conjunto(Lista);
        HashSet<Integer> inteiros = new HashSet<>();

        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);
        inteiros.add(2);

        for(Integer elem : inteiros){
            System.out.println(elem);
        }

        if(inteiros.contains(2)){
            System.out.println("2 está no conjunto");
        }else{
            System.out.println("2 não está no conjunto");
        }

        inteiros.remove(2);

        if(inteiros.contains(2)){
            System.out.println("2 está no conjunto");
        }else{
            System.out.println("2 não está no conjunto");
        }
        
        inteiros.clear();

        if(inteiros.isEmpty()){
            System.out.println("A lista está vazia");
        }else{
            System.out.println("A lista não está vazia");
        }
    }
}
