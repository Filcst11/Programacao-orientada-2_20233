package Heranca;

import Heranca.empresa.Engenheiro;
import Heranca.empresa.Diretor;
import Heranca.empresa.Funcionario;
import Heranca.empresa.Gerente;

public class Executavel {

    public static void main(String[] args) {
        
        Engenheiro eng1 = new Engenheiro("Felipe", 123, 619291, 123, "Projeto1");
        Engenheiro eng2 = new Engenheiro("Eduardo", 124, 619598, 124, "Projeto2");  

        System.out.println("\n\nEngenheiros:\n");
        imprimirFuncionario(eng1);
        System.out.println(eng2);

        Gerente ger1 = new Gerente("João", 2222, 6192222, 2);

        System.out.println("\n\nGerentes:");
        imprimirFuncionario(ger1);
        System.out.println("\n\n\n");
        

        Diretor dir1 = new Diretor("Elaine", 111, 61111, 5);

        System.out.println("\n\nDiretores:");
        imprimirFuncionario(dir1);
        System.out.println("\n\n\n");


        imprimirFuncionario(eng1);
    }

    public static void imprimirFuncionario(Funcionario x){
        System.out.println(x);
    }
    
}
