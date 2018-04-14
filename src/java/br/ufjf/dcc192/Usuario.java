package br.ufjf.dcc192;

import java.util.List;

public class Usuario {
    String codigo;
    String nome;
    List<Figurinhas> album;

    public Usuario(String codigo, String nome, List<Figurinhas> album) {
        this.codigo = codigo;
        this.nome = nome;
        this.album = album;
    }

    public Usuario() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }   

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void setAlbum(List<Figurinhas> album) {
        this.album = album;
    }

    public List<Figurinhas> getAlbum() {
        return album;
    }
    
}
