package com.vk.whatsapplist.Model;

public class Usuario {
// essas são as propiedades que nosso usuario tem (foto,nome e mensagem)
    private int foto;
    private String nome;
    private String mensagem;

    //O construtor para podermos acessar de fora da classe
    public Usuario(int foto, String nome, String mensagem) {
        this.foto = foto;
        this.nome = nome;
        this.mensagem = mensagem;
    }


    //os Gertes and setters das nossas propiedades
    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
