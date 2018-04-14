package br.ufjf.dcc192;

public class Figurinhas {
    String codigo;
    String descricao;

    public Figurinhas(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Figurinhas() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefas: " + "Titulo: " + codigo + " / Descricao: " + descricao;
    }
    
    
    
}
