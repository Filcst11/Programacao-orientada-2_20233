package atividade5.transporte;

public class Veiculo {

    protected String marca;
    protected String modelo;
    protected Integer anoFabricacao;
    protected Integer qtdPassageiros;
    


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoFabricacao() {
        return this.anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Integer getQtdPassageiros() {
        return this.qtdPassageiros;
    }

    public void setQtdPassageiros(Integer qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public void acelerar(){
        System.out.println("\nAperta o acelerador e vruuuuuuuuum *Barulho de aceleração*\n");
    }

    public void frear(){
        System.out.println("\nAperta o freio e grrrrrrrrr *Barulho de freio*\n");
    }

    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", anoFabricacao='" + getAnoFabricacao() + "'" +
            ", qtdPassageiros='" + getQtdPassageiros() + "'" +
            "}";
    }

    
}
