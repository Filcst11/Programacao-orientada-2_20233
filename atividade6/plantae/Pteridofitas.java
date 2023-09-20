package atividade6.plantae;

public class Pteridofitas extends Plantas {

    private String tipoVasoCondutor;

    public Pteridofitas(String nome, Integer tamanho, String local, String tipoVasoCondutor){
        
        setNome(nome);
        setTamanho(tamanho);
        setLocal(local);
        setTipoVasoCondutor(tipoVasoCondutor);
    }

    public String getTipoVasoCondutor() {
        return tipoVasoCondutor;
    }

    public void setTipoVasoCondutor(String tipoVasoCondutor) {
        this.tipoVasoCondutor = tipoVasoCondutor;
    }


    @Override
    public String toString() {
        return "{" +
            " Nome ='" + getNome() + "'" +
            ", Tamanho =' até " + getTamanho() + "cm'" +
            ", Local ='" + getLocal() + "'" +
            ", tipo de Vaso Condutor ='" + getTipoVasoCondutor() + "'" +
            "}";
    }
    
    
}
