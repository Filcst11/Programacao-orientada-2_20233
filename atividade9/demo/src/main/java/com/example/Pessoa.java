package com.example;

public class Pessoa {
    
    protected String nome;
    protected Integer idade;

    public Pessoa(String nome, Integer idade){
        this.setNome(nome);
        this.setIdade(idade);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String dizerOla(){
        
        return "Olá, o meu nome é " + this.nome; 
    }
    
}

