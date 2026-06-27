package model;

public class Jogo {
    
    private int id;
    private String titulo;
    private String idadeRecomendada;
    private String modalidade;
    private String status;

    public Jogo() {
    }

    public Jogo(String titulo, String idadeRecomendada, String modalidade, String status) {
        this.titulo = titulo;
        this.idadeRecomendada = idadeRecomendada;
        this.modalidade = modalidade;
        this.status = status;
    }

    public Jogo(int id, String titulo, String idadeRecomendada, String modalidade, String status) {
        this.id = id;
        this.titulo = titulo;
        this.idadeRecomendada = idadeRecomendada;
        this.modalidade = modalidade;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdadeRecomendada() {
        return idadeRecomendada;
    }

    public void setIdadeRecomendada(String idadeRecomendada) {
        this.idadeRecomendada = idadeRecomendada;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}