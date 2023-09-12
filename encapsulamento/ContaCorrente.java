package encapsulamento;


public class ContaCorrente {
    private Integer numeroDaConta;
    private Double saldo;

    public ContaCorrente(){
        try {
            this.setSaldo(0.0);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public ContaCorrente(Integer numero){
        try {
            this.setNumeroDaConta(numero);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }        
    }
    public ContaCorrente(Integer numero, Double saldo){
        try {
            this.setNumeroDaConta(numero);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }        
        try {
            this.setSaldo(saldo);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public Integer getNumeroDaConta(){

        return this.numeroDaConta;
    }
    public void setNumeroDaConta(Integer numero) throws Exception{
        if (numero < 1){
            throw new Exception("Número da conta inválido");
        }
        this.numeroDaConta = numero;        
    }
    public Double getSaldo(){

        return this.saldo;
    }
    public void setSaldo(Double valor) throws Exception{
        this.saldo = valor;
    }
    
    public void transferirSaldo(ContaCorrente contaDestino, Double valorTransferido){
        if (this.getSaldo() > valorTransferido){
            try {
                this.setSaldo(this.getSaldo() - valorTransferido);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            try {
                contaDestino.setSaldo(contaDestino.getSaldo() + valorTransferido);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }            
        }
    }

    public void depositar(Double valorDeposito){
        if (valorDeposito > 0){
            try {
                this.setSaldo(this.getSaldo() + valorDeposito);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
 
 //Esta função é static pq ela é da Classe "contaCorrente" e não do Objeto "c1,c2,c3"
    public static void depositar(ContaCorrente contaParaDepositar, Double Valor){
        if (Valor > 0){
            try {
                contaParaDepositar.setSaldo(contaParaDepositar.getSaldo() + Valor);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
