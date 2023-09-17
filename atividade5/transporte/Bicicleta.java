package atividade5.transporte;

public class Bicicleta extends Veiculo{

    private String material;

    public Bicicleta(String marca, String modelo, Integer anoFabricacao, Integer qtdPassageiros, String material) {
        setMarca(marca);
        setModelo(modelo);
        setAnoFabricacao(anoFabricacao);
        setQtdPassageiros(qtdPassageiros);
        setMaterial(material);
        
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void acelerar(){
        System.out.println("\nGira os pedais e vaiiiii\n");
    }

    @Override
    public void frear(){
        System.out.println("\nAperta o freio e grrrrrrrrr *Barulho de freio*\n");
    } 

    @Override
    public String toString() {
        return "{" +
            " marca ='" + getMarca() + "'" +
            ", modelo ='" + getModelo() + "'" +
            ", ano Fabricação ='" + getAnoFabricacao() + "'" +
            ", qtd Passageiros ='" + getQtdPassageiros() + "'" +
            ", combustivel ='" + getMaterial() + "'" +
            "}";
    }  
}
