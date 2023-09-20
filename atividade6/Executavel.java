package atividade6;

import atividade6.plantae.Briofitas;
import atividade6.plantae.Pteridofitas;
import atividade6.plantae.Angiospermas;
import atividade6.plantae.Gimnospermas;

public class Executavel {
    public static void main(String[] args) {
    //BRIOFITAS
        System.out.println("\n===============================================================\n\n                          Briofitas:\n\n");

        //Criando uma briófita
        Briofitas B1 = new Briofitas("Musgo Bryum capillare",10,"habitats húmidos e sombrios","caulóide");
        
        //Mostrando
        System.out.println(B1.toString());
        System.out.println("\n\nReprodução: ");
        B1.reproducao();
        System.out.println("\n\nFotossíntese: ");
        B1.fotossintese();
    
    //PTERIDÓFITAS
        System.out.println("\n===============================================================\n\n                          Pteridófitas:\n\n");

        //Criando uma pteridófita
        Pteridofitas P1 = new Pteridofitas("Samambaia",40,"áreas quentes e úmidas da Terra","Xilema e Floema");
        
        //Mostrando
        System.out.println(P1.toString());
        System.out.println("\n\nReprodução: ");
        P1.reproducao();
        System.out.println("\n\nFotossíntese: ");
        P1.fotossintese();
    
    //GIMNOSPERMAS
        System.out.println("\n===============================================================\n\n                          Gimnospermas:\n\n");

        //Criando uma Gimnosperma
        Gimnospermas G1 = new Gimnospermas("Araucária",50,"Regiões serranas frias e úmidas","Pinhão");
        
        //Mostrando
        System.out.println(G1.toString());
        System.out.println("\n\nReprodução: ");
        G1.reproducao();
        System.out.println("\n\nFotossíntese: ");
        G1.fotossintese();
        

    //ANGIOSPERMAS
        System.out.println("\n===============================================================\n\n                          Angiospermas:\n\n");

        //Criando uma Angiosperma
        Angiospermas A1 = new Angiospermas("Mangueira",40,"Solos úmidos e com bastante sol","Hermafroditas e estaminadas","Manga");
        
        //Mostrando
        System.out.println(A1.toString());
        System.out.println("\n\nReprodução: ");
        A1.reproducao();
        System.out.println("\n\nFotossíntese: ");
        A1.fotossintese();
        
    }
}
