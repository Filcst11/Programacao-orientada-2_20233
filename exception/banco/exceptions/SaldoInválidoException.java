package exception.banco.exceptions;

public class SaldoInválidoException extends Exception {
    public SaldoInválidoException(){
        super("Saldo inválido!\n");
    }
}
