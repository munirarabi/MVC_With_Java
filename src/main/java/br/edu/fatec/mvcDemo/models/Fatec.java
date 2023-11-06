package br.edu.fatec.mvcDemo.models;

public class Fatec {

    private String nome;
    private String localizacao;
    private String cursos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public Fatec(String nome, String localizacao, String cursos) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.cursos = cursos;
    }
}
