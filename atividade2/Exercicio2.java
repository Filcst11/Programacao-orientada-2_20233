package atividade2;

class ConversorTemperatura{
    public float recebe;
    public float retorna; 

    public float ConverteCelsiusFahrenheit(){
        this.retorna = (this.recebe * (9/5)) + 32;
        return this.retorna;
    }
    public float ConverteFahrenheitCelsius(){
        this.retorna = (this.recebe - 32) * (5/9);
        return this.retorna;
    }
}

class Programa{
    public static void main(String[] args){
        /*Escolha o tipo de conversão:
          1- Celsius para Fahrenheit
          2- Fahrenheit para Celsius*/
        int escolha = 1;

        ConversorTemperatura conversor;
        conversor = new ConversorTemperatura();

        //Celsius para Fahrenheit        
        if(escolha == 1){
            //Escreva a temperatura em Celcius para transformar em fahrenheit
            conversor.recebe = 32;
            float Fah = conversor.ConverteCelsiusFahrenheit();            
        }
        //Fahrenheit para Celsius
        if(escolha == 2){
            //Escreva a temperatura em Celcius para transformar em fahrenheit
            conversor.recebe = 32;
            float Cel = conversor.ConverteCelsiusFahrenheit();            
        }

    }
}