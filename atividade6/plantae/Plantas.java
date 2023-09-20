package atividade6.plantae;

public class Plantas {
    
    protected String nome;
    protected Integer tamanho;
    protected String local;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void fotossintese(){
        System.out.println("Eu consigo me alimentar de sol e água\n");
    }

    //briofitas e pteridófitas
    public void reproducao(){
        System.out.println("Eu preciso de água para que os meus gametas masculinos saiam \"nadando\" por ai e se encontrem com os gametas femininos para ocorrer a fecundação\n");
    }
}
