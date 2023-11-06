package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        Vector<String> frutas = new Vector<>();

        ArrayList<String> frutas2 = new ArrayList<>();

        frutas.add("maçã");
        frutas.add("pêra");
        frutas2.add("pêra");
        frutas.add("goiaba");
        frutas.add("manga");

        System.out.println(frutas.get(2));

        if(verificaExistenciaDeUmaFruta(frutas2, "pêra")){
            System.out.println("Pêra está no vector");
        }
    }

    public static boolean verificaExistenciaDeUmaFruta(List frutas,String fruta){
        return frutas.contains(fruta);
    }
}
