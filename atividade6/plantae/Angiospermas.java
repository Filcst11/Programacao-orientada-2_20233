package atividade6.plantae;

public class Angiospermas extends Plantas {

    String tipoFlor;
    String tipoFruto;

    public Angiospermas(String nome, Integer tamanho, String local, String tipoFlor, String tipoFruto){
        setNome(nome);
        setTamanho(tamanho);
        setLocal(local);
        setTipoFlor(tipoFlor);
        setTipoFruto(tipoFruto);

    }
    
    public String getTipoFlor() {
        return tipoFlor;
    }

    public void setTipoFlor(String tipoFlor) {
        this.tipoFlor = tipoFlor;
    }

    public String getTipoFruto() {
        return tipoFruto;
    }

    public void setTipoFruto(String tipoFruto) {
        this.tipoFruto = tipoFruto;
    }

    @Override
    public void reproducao(){
        System.out.println("\nAs minhas flores chamam atenção de alguns animais e insetos que levam os meus gametas masculinos até os gametas femininos através da polinização e assim eu gero sementes com frutos para me reproduzir.");
    }

    @Override
    public String toString() {
        return "{" +
            " Nome ='" + getNome() + "'" +
            ", Tamanho ='Até " + getTamanho() + "m'" +
            ", Local ='" + getLocal() + "'" +
            ", Tipo de Flor ='" + getTipoFlor() + "'" +
            ", Tipo de Fruto ='" + getTipoFruto() + "'" +
            "}";
    }
    
}