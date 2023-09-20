package atividade6.plantae;

public class Briofitas extends Plantas {
    
    private String celulasEspecializadas;

    public Briofitas(String nome, Integer tamanho, String local, String celulaEspecializada){
        setNome(nome);
        setTamanho(tamanho);
        setLocal(local);
        setCelulasEspecializadas(celulaEspecializada);
    }

    public String getCelulasEspecializadas() {
        return this.celulasEspecializadas;
    }

    public void setCelulasEspecializadas(String celulasEspecializadas) {
        this.celulasEspecializadas = celulasEspecializadas;
    }


    @Override
    public String toString() {
        return "{" +
            " Nome ='" + getNome() + "'" +
            ", Tamanho ='até " + getTamanho() + " cm'" +
            ", Local ='" + getLocal() + "'" +
            ", Celulas Especializadas ='" + getCelulasEspecializadas() + "'" +
            "}";
    }
    

}
