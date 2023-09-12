package encapsulamento;


public class Executavel {

    public static void main(String[] args){
        
        ContaCorrente c1 = new ContaCorrente(1234);
        ContaCorrente c2 = new ContaCorrente(1234, 100.00);
        ContaCorrente c3 = new ContaCorrente();
        
        try {
            c1.setSaldo(100.00);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("Numero da conta 1: "+ c1.getNumeroDaConta() + " Saldo:" + c1.getSaldo());

        System.out.println("Numero da conta 2: "+ c2.getNumeroDaConta() + " Saldo:" + c2.getSaldo());

        System.out.println("Numero da conta 3: "+ c3.getNumeroDaConta() + " Saldo:" + c3.getSaldo());
        
        c3.depositar(100.00);

        c2.transferirSaldo(c3, 50.00);

        ContaCorrente.depositar(c2, 50.00);
        
        System.out.println("\n\nDepositei 100 na Conta 3\nTransferi 50 da Conta 2 para Conta 3:\nDepositei 50 na Conta 2\n\n");

        System.out.println("Numero da conta 1: "+ c1.getNumeroDaConta() + " Saldo:" + c1.getSaldo());

        System.out.println("Numero da conta 2: "+ c2.getNumeroDaConta() + " Saldo:" + c2.getSaldo());

        System.out.println("Numero da conta 3: "+ c3.getNumeroDaConta() + " Saldo:" + c3.getSaldo());
        
    }
    
}
