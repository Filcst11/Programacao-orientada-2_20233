package atividade5;


import atividade5.transporte.Carro;
import atividade5.transporte.Moto;
import atividade5.transporte.Bicicleta;

public class Executavel {

    public static void main(String[] args) {
        
        //Carro
        System.out.println("Bicicleta:\n");

        Carro carro1 = new Carro("VW","GOL",2018,5,"Gasolina","123456");

        carro1.acelerar();
        carro1.frear();
        System.out.println(carro1.toString() + "\n\n"); 

        //Bicicleta
        System.out.println("Bicicleta:\n");

        Bicicleta bicicleta1 = new Bicicleta("Caloi","Motorizada",2020,1,"Alumínio");
        
        bicicleta1.acelerar();
        bicicleta1.frear();
        System.out.println(bicicleta1.toString() + "\n\n");

        //Moto
        System.out.println("Moto:\n");

        Moto moto1 = new Moto("Yamaha","PC X",2019,2,"Azul");
        
        moto1.acelerar();
        moto1.frear();
        System.out.println(moto1.toString() + "\n\n");
    }
    
}
