package atividade6.plantae;

public class Gimnospermas extends Plantas{

    private String tipoSemente;

    public Gimnospermas(String nome, Integer tamanho, String local, String tipoSemente){

        setNome(nome);
        setTamanho(tamanho);
        setLocal(local);
        setTipoSemente(tipoSemente);

    }
    
    public String getTipoSemente() {
        return tipoSemente;
    }

    public void setTipoSemente(String tipoSemente) {
        this.tipoSemente = tipoSemente;
    }

    @Override
    public void reproducao(){
        System.out.println("\nEu preciso de alguns animais e insetos para levar os meus gametas masculinos até os gametas femininos através da polinização para me reproduzir e gerar sementes sem frutos");
    }

    @Override
    public String toString() {
        return "{" +
            " Nome ='" + getNome() + "'" +
            ", Tamanho ='Até " + getTamanho() + " metros'" +
            ", Local ='" + getLocal() + "'" +
            ", tipo de Semente ='" + getTipoSemente() + "'" +
            "}";
    }
    
}
