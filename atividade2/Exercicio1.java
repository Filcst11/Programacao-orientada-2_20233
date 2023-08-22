package atividade2;

class Calculadora{
    int num1,num2;

    public void Soma(){
        int resultado;

        resultado = this.num1 + this.num2;
        System.out.println("A soma é: "+ resultado);
    }
    public void Subtracao(){
        int resultado;

        resultado = this.num1 - this.num2;
        System.out.println("A subtração é: "+ resultado);
    }
    public void Multiplicacao(){
        int resultado;

        resultado = this.num1 * this.num2;
        System.out.println("A multiplicação é: "+ resultado);
    }
    public void Divisao(){
        int resultado;

        resultado = this.num1 / this.num2;
        System.out.println("A divisao é: "+ resultado);
    }    
    
}
class Programa{
    public static int resultado;
    public static void main(String[] args){
        
        //Insira a operação desejada abaixo: +, -, * ou /
        char operacao = '/';

        //Cria a calculadora e adiciona os números
        Calculadora calc1;
        calc1 = new Calculadora();
        //Insira os dois números que você quer que sejam utilizados para conta.
        calc1.num1 = 20;
        calc1.num2 = 10;
        
        //Faz ascontas de acordo com o valor da 'operacao'
        if (operacao == '+'){
            calc1.Soma();
        }
        if (operacao == '-'){
            calc1.Subtracao();
        }
        if (operacao == '*'){
            calc1.Multiplicacao();
        }
        if (operacao == '/'){
            calc1.Divisao();
        }
       
    }
    
}
