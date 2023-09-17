package atividade5.transporte;

public class Moto extends Veiculo{
    
    private String corCapacete;

    public Moto(String marca, String modelo, Integer anoFabricacao, Integer qtdPassageiros, String corCapacete) {
        setMarca(marca);
        setModelo(modelo);
        setAnoFabricacao(anoFabricacao);
        setQtdPassageiros(qtdPassageiros);
        setCorCapacete(corCapacete);
        
    }

    public String getCorCapacete() {
        return this.corCapacete;
    }

    public void setCorCapacete(String corCapacete) {
        this.corCapacete = corCapacete;
    }

    @Override
    public String toString() {
        return "{" +
            " marca ='" + getMarca() + "'" +
            ", modelo ='" + getModelo() + "'" +
            ", ano Fabricação ='" + getAnoFabricacao() + "'" +
            ", qtd Passageiros ='" + getQtdPassageiros() + "'" +
            ", chassi ='" + getCorCapacete() + "'" +
            "}";
    }


    
}
