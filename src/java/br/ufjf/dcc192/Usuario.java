package br.ufjf.dcc192;

public class Usuario {
    String codigo;
    String nome;

    public Usuario(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Usuario() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getDescricao() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.nome = descricao;
    }

    @Override
    public String toString() {
        return "Tarefas: " + "Titulo: " + codigo + " / Descricao: " + nome;
    }
    
    
    
}
