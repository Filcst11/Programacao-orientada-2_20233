package exception;


import exception.banco.Banco;

public class Executavel {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.abrirConta("Conta1", 1);

        try {
           banco.pesquisarConta("Conta1");

        } catch (NullPointerException e) {
            System.out.println("\n\nExiste uma conta com nome\n");
        }
        catch (Exception e) {
            System.out.println("\n\nNão foi possível pesquisar a conta, tente novamente mais tarde\n");
        }

        banco.depositar("conta1", 100.0);

        
        
        

    }
}
