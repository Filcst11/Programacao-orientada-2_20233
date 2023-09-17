package atividade5.transporte;

public class Carro extends Veiculo{

    private String combustivel;
    private String chassi;



    public Carro( String marca, String modelo, Integer anoFabricacao, Integer qtdPassageiros, String combustivel, String chassi) {
        setMarca(marca);
        setModelo(modelo);
        setAnoFabricacao(anoFabricacao);
        setQtdPassageiros(qtdPassageiros);
        setCombustivel(combustivel);
        setChassi(chassi);
    }


    public String getCombustivel() {
        return this.combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getChassi() {
        return this.chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }


    @Override
    public String toString() {
        return "{" +
            " marca ='" + getMarca() + "'" +
            ", modelo ='" + getModelo() + "'" +
            ", ano Fabricação ='" + getAnoFabricacao() + "'" +
            ", qtd Passageiros ='" + getQtdPassageiros() + "'" +
            ", combustivel ='" + getCombustivel() + "'" +
            ", chassi ='" + getChassi() + "'" +
            "}";
    }


    
}
