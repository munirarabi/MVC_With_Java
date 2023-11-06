package br.edu.fatec.mvcDemo.models;

public class Professor {

    private String nome;
    private String disciplina;
    private String curso;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDisciplina() {
        return disciplina;
    }


    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Professor(String nome, String disciplina, String curso) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.curso = curso;
    }
}
